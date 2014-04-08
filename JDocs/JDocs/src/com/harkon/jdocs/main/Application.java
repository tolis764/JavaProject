package com.harkon.jdocs.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//import com.harkon.jdocs.bo.ui.BackOfficeWindow;
import com.harkon.jdocs.config.ApplicationConfig;
import com.harkon.jdocs.config.ui.DatabaseConfigurationDialog;
//import com.harkon.jdocs.model.PrinterConfiguration;
//import com.harkon.jdocs.model.Restaurant;
//import com.harkon.jdocs.model.Shift;
//import com.harkon.jdocs.model.Terminal;
import com.harkon.jdocs.model.User;
//import com.harkon.jdocs.model.dao.PrinterConfigurationDAO;
//import com.harkon.jdocs.model.dao.RestaurantDAO;
//import com.harkon.jdocs.model.dao.TerminalDAO;
import com.harkon.jdocs.model.dao._RootDAO;
import com.harkon.jdocs.swing.GlassPane;
import com.harkon.jdocs.swing.TransparentPanel;
//import com.harkon.jdocs.ui.dialog.NumberSelectionDialog;
import com.harkon.jdocs.ui.views.LoginScreen;
import com.harkon.jdocs.ui.views.PasswordScreen;
import com.harkon.jdocs.ui.views.RootView;
//import com.harkon.jdocs.util.TicketActiveDateSetterTask;
//import com.jgoodies.looks.plastic.PlasticXPLookAndFeel;
//import com.jgoodies.looks.plastic.theme.ExperienceBlue;
import com.jgoodies.looks.plastic.PlasticXPLookAndFeel;
import com.jgoodies.looks.plastic.theme.ExperienceBlue;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.TimeZone;

public class Application {

    private static Log logger = LogFactory.getLog(Application.class);
//    private Timer autoDrawerPullTimer;
//    private Terminal terminal;
    private JdocsWindow jdocsWindow;
    private User currentUser;
    private RootView rootView;
//    private BackOfficeWindow backOfficeWindow;
//    private Shift currentShift;
//    public PrinterConfiguration printConfiguration;
//    private Restaurant restaurant;
    private static Application instance;
    private static Locale locale = new Locale("el", "GR");
    private static DecimalFormat decimalFormat = new DecimalFormat(",##0.00");
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
    private static ImageIcon applicationIcon;
    public final static String VERSION = "0.1";

    private Application() {

        Locale.setDefault(locale);
//        applicationIcon = new ImageIcon(getClass().getResource("/icons/icon.png"));
        jdocsWindow = new JdocsWindow();
        jdocsWindow.setGlassPaneVisible(true);
        jdocsWindow.setTitle(getTitle());
//        jdocsWindow.setIconImage(applicationIcon.getImage());
        jdocsWindow.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                shutdownJDocs();

            }
        });
    }

    public void start() {
        try {
            PlasticXPLookAndFeel.setMyCurrentTheme(new ExperienceBlue());
            UIManager.setLookAndFeel(new PlasticXPLookAndFeel());
            UIManager.put("ComboBox.is3DEnabled", Boolean.FALSE);
        } catch (Exception e) {
            e.printStackTrace();
        }

        rootView = RootView.getInstance();

        TransparentPanel panel = new TransparentPanel(new BorderLayout());
        panel.setOpaque(true);
        panel.add(rootView);

        jdocsWindow.setContentPane(panel);
        jdocsWindow.setSize(ApplicationConfig.getPreferences().getInt("wwidth", 900), ApplicationConfig.getPreferences().getInt("wheight", 650));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jdocsWindow.setLocation(ApplicationConfig.getPreferences().getInt("wlocx", ((screenSize.width - jdocsWindow.getWidth()) >> 1)), ApplicationConfig.getPreferences().getInt("wlocy", ((screenSize.height - jdocsWindow.getHeight()) >> 1)));
        jdocsWindow.setMinimumSize(new Dimension(800, 600));
        jdocsWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jdocsWindow.setVisible(true);

        initDatabase();
    }

    public void initDatabase() {
        if (!ApplicationConfig.checkDatabaseConnection()) {
            DatabaseConfigurationDialog dialog = new DatabaseConfigurationDialog(getJDocsWindow(), true);
            dialog.setTitle(com.harkon.jdocs.JDocsConstants.DATABASE_CONNECTION_ERROR);
            dialog.setExitOnClose(true);
            dialog.pack();
            dialog.open();
        }


        try {
            ((GlassPane) jdocsWindow.getGlassPane()).setMessage(com.harkon.jdocs.JDocsConstants.LOADING);
            _RootDAO.initialize();

//            int terminalId = ApplicationConfig.getTerminalId();
//            logger.info("Terminal ID from configuration=" + terminalId);
            //System.out.println("termid:" + terminalId);

//            if (terminalId == -1) {
//                NumberSelectionDialog dialog = new NumberSelectionDialog();
//                dialog.setDecimalAllowed(false);
//                dialog.setTitle(com.harkon.jdocs.POSConstants.ENTER_ID_FOR_TERMINAL);
//                dialog.setVisible(true);
//                terminalId = (int) dialog.getValue();
//            }

//            TerminalDAO terminalDAO = new TerminalDAO();
//            Terminal terminal2 = terminalDAO.get(new Integer(terminalId));
//            if (terminal2 == null) {
//                terminal2 = new Terminal();
//                terminal2.setId(terminalId);
//                terminal2.setOpeningBalance(new Double(500));
//                terminal2.setCurrentBalance(new Double(500));
//                terminal2.setName(com.harkon.jdocs.POSConstants.TERMINAL + " - " + terminalId);
//                terminalDAO.saveOrUpdate(terminal2);
//            }
//            ApplicationConfig.setTerminalId(terminalId);
//            this.terminal = terminal2;
//
//            printConfiguration = new PrinterConfigurationDAO().get(PrinterConfiguration.ID);
//            if (printConfiguration == null) {
//                printConfiguration = new PrinterConfiguration();
//            }
//
//            refreshRestaurant();

            PasswordScreen.getInstance().setUserTypes();

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + 1);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);

            //SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd HH:mm:s a");
            Date time = calendar.getTime();
            //System.out.println("expected next launch: " + format.format(time));

//            TicketActiveDateSetterTask ticketActiveDateSetterTask = new TicketActiveDateSetterTask();
//            ticketActiveDateSetterTask.run();

//            java.util.Timer activeDateScheduler = new java.util.Timer();
//            activeDateScheduler.scheduleAtFixedRate(ticketActiveDateSetterTask, time, 86400 * 1000);
        } finally {
            getJDocsWindow().setGlassPaneVisible(false);
        }
    }

    public void refreshRestaurant() {
//        RestaurantDAO restaurantDAO = RestaurantDAO.getInstance();
//        System.out.println("rest:" + restaurantDAO.toString());
//        this.restaurant = restaurantDAO.get(Integer.valueOf(1));
//        System.out.println("rest:" + this.restaurant);
//        if (restaurant.isAutoDrawerPullEnable() && autoDrawerPullTimer == null) {
//            autoDrawerPullTimer = new Timer(60 * 1000, new AutoDrawerPullAction());
//            autoDrawerPullTimer.start();
//        } else {
//            if (autoDrawerPullTimer != null) {
//                autoDrawerPullTimer.stop();
//                autoDrawerPullTimer = null;
//            }
//        }
    }

    public static String getCurrencyName() {
//        Application application = getInstance();
//        if (application.restaurant == null) {
//            application.refreshRestaurant();
//        }
//        return application.restaurant.getCurrencyName();
        return null;
    }

    public static String getCurrencySymbol() {
//        Application application = getInstance();
//        if (application.restaurant == null) {
//            application.refreshRestaurant();
//        }
//        return application.restaurant.getCurrencySymbol();
        return null;
    }

    public synchronized static Application getInstance() {
        if (instance == null) {
            instance = new Application();

        }
        return instance;
    }

    public void shutdownJDocs() {
        int option = JOptionPane.showOptionDialog(getJDocsWindow(), com.harkon.jdocs.JDocsConstants.SURE_SHUTDOWN_, com.harkon.jdocs.JDocsConstants.CONFIRM_SHUTDOWN, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (option != JOptionPane.YES_OPTION) {
            return;
        }

        int width = jdocsWindow.getWidth();
        int height = jdocsWindow.getHeight();
        ApplicationConfig.getPreferences().putInt("wwidth", width);
        ApplicationConfig.getPreferences().putInt("wheight", height);

        Point locationOnScreen = jdocsWindow.getLocationOnScreen();
        ApplicationConfig.getPreferences().putInt("wlocx", locationOnScreen.x);
        ApplicationConfig.getPreferences().putInt("wlocy", locationOnScreen.y);

        System.exit(0);
    }

    public void logout() {
//        if (backOfficeWindow != null) {
//            backOfficeWindow.setVisible(false);
//            backOfficeWindow = null;
//            currentShift = null;
//        }

        setCurrentUser(null);
        RootView.getInstance().showView(LoginScreen.VIEW_NAME);
    }

    public static Locale getLocale() {
        return locale;
    }

    public static User getCurrentUser() {
        return getInstance().currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public RootView getRootView() {
        return rootView;
    }

    public void setRootView(RootView rootView) {
        this.rootView = rootView;
    }

    public static JdocsWindow getJDocsWindow() {
        return getInstance().jdocsWindow;
    }

//    public BackOfficeWindow getBackOfficeWindow() {
//        return backOfficeWindow;
//    }
//
//    public void setBackOfficeWindow(BackOfficeWindow backOfficeWindow) {
//        this.backOfficeWindow = backOfficeWindow;
//    }
//
//    public Terminal getTerminal() {
//
//        TerminalDAO.getInstance().refresh(terminal);
//
//        return terminal;
//    }

    public static String getTitle() {
        return "JDocs - Version " + VERSION;
    }

    public static ImageIcon getApplicationIcon() {
        return applicationIcon;
    }

    public static void setApplicationIcon(ImageIcon applicationIcon) {
        Application.applicationIcon = applicationIcon;
    }

//    public Shift getCurrentShift() {
//        return currentShift;
//    }
//
//    public void setCurrentShift(Shift currentShift) {
//        this.currentShift = currentShift;
//    }

//    public void setAutoDrawerPullEnable(boolean enable) {
//        if (enable) {
//            if (autoDrawerPullTimer != null) {
//                return;
//            } else {
//                autoDrawerPullTimer = new Timer(60 * 1000, new AutoDrawerPullAction());
//                autoDrawerPullTimer.start();
//            }
//        } else {
//            autoDrawerPullTimer.stop();
//            autoDrawerPullTimer = null;
//        }
//    }

    public static String formatNumber(Double number) {
        if (number == null) {
            return "0.00";
        }
        NumberFormat nf = NumberFormat.getNumberInstance(getLocale());
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("#,##0.00");
        String value = df.format(number);
        //System.out.println(value + " " + Locale.getDefault());

        if (value.equals("-0.00")) {
            return "0.00";
        }
        return value;
    }

    public static String formatDate(Date date) {
        return dateFormat.format(date);
    }
}
