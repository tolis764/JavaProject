package com.harkon.jdocs.model.dao;

import org.hibernate.cfg.Configuration;

import com.harkon.jdocs.config.ApplicationConfig;
//import com.harkon.jdocs.model.ActionHistory;
import com.harkon.jdocs.model.AttendenceHistory;
//import com.harkon.jdocs.model.CashDrawerResetHistory;
//import com.harkon.jdocs.model.CookingInstruction;
//import com.harkon.jdocs.model.CouponAndDiscount;
//import com.harkon.jdocs.model.DrawerPullReport;
//import com.harkon.jdocs.model.Gratuity;
//import com.harkon.jdocs.model.MenuCategory;
//import com.harkon.jdocs.model.MenuGroup;
//import com.harkon.jdocs.model.MenuItem;
//import com.harkon.jdocs.model.MenuItemModifierGroup;
//import com.harkon.jdocs.model.MenuItemShift;
//import com.harkon.jdocs.model.MenuModifier;
//import com.harkon.jdocs.model.MenuModifierGroup;
//import com.harkon.jdocs.model.PayoutReason;
//import com.harkon.jdocs.model.PayoutRecepient;
//import com.harkon.jdocs.model.PosTransaction;
//import com.harkon.jdocs.model.PrinterConfiguration;
//import com.harkon.jdocs.model.Restaurant;
//import com.harkon.jdocs.model.RestaurantTable;
//import com.harkon.jdocs.model.Shift;
//import com.harkon.jdocs.model.Tax;
//import com.harkon.jdocs.model.Terminal;
//import com.harkon.jdocs.model.Ticket;
//import com.harkon.jdocs.model.TicketCouponAndDiscount;
//import com.harkon.jdocs.model.TicketItem;
//import com.harkon.jdocs.model.TicketItemModifier;
//import com.harkon.jdocs.model.TicketItemModifierGroup;
import com.harkon.jdocs.model.User;
import com.harkon.jdocs.model.UserPermission;
import com.harkon.jdocs.model.UserType;
//import com.harkon.jdocs.model.VoidReason;





public abstract class _RootDAO extends com.harkon.jdocs.model.dao._BaseRootDAO {

	static {
		//initialize();
	}
/*
	If you are using lazy loading, uncomment this
	Somewhere, you should call RootDAO.closeCurrentThreadSessions();
	public void closeSession (Session session) {
		// do nothing here because the session will be closed later
	}
*/

/*
	If you are pulling the SessionFactory from a JNDI tree, uncomment this
	protected SessionFactory getSessionFactory(String configFile) {
		// If you have a single session factory, ignore the configFile parameter
		// Otherwise, you can set a meta attribute under the class node called "config-file" which
		// will be passed in here so you can tell what session factory an individual mapping file
		// belongs to
		return (SessionFactory) new InitialContext().lookup("java:/{SessionFactoryName}");
	}
*/
	
	public static void initialize() {
		Configuration configuration = new Configuration();
//		configuration = configuration.addClass(ActionHistory.class);
		configuration = configuration.addClass(AttendenceHistory.class);
//		configuration = configuration.addClass(CashDrawerResetHistory.class);
//		configuration = configuration.addClass(CookingInstruction.class);
//		configuration = configuration.addClass(CouponAndDiscount.class);
//		configuration = configuration.addClass(Gratuity.class);
//		configuration = configuration.addClass(MenuCategory.class);
//		configuration = configuration.addClass(MenuGroup.class);
//		configuration = configuration.addClass(MenuItem.class);
//		configuration = configuration.addClass(MenuItemModifierGroup.class);
//		configuration = configuration.addClass(MenuItemShift.class);
//		configuration = configuration.addClass(MenuModifier.class);
//		configuration = configuration.addClass(MenuModifierGroup.class);
//		configuration = configuration.addClass(PayoutReason.class);
//		configuration = configuration.addClass(PayoutRecepient.class);
//		configuration = configuration.addClass(Restaurant.class);
//		configuration = configuration.addClass(RestaurantTable.class);
//		configuration = configuration.addClass(Shift.class);
//		configuration = configuration.addClass(Tax.class);
//		configuration = configuration.addClass(Terminal.class);
//		configuration = configuration.addClass(Ticket.class);
//		configuration = configuration.addClass(TicketCouponAndDiscount.class);
//		configuration = configuration.addClass(TicketItem.class);
//		configuration = configuration.addClass(TicketItemModifier.class);
//		configuration = configuration.addClass(TicketItemModifierGroup.class);
//		configuration = configuration.addClass(PosTransaction.class);
		configuration = configuration.addClass(User.class);
//		configuration = configuration.addClass(VoidReason.class);
//		configuration = configuration.addClass(DrawerPullReport.class);
//		configuration = configuration.addClass(PrinterConfiguration.class);
		configuration = configuration.addClass(UserPermission.class);
		configuration = configuration.addClass(UserType.class);
		//configuration = configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
		//configuration = configuration.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.ClientDriver");
		configuration = configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		configuration = configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		configuration = configuration.setProperty("hibernate.connection.url", ApplicationConfig.getConnectionURL());
		configuration = configuration.setProperty("hibernate.connection.username", ApplicationConfig.getDatabaseUser());
		configuration = configuration.setProperty("hibernate.connection.password", ApplicationConfig.getDatabasePassword());
		configuration = configuration.setProperty("hibernate.hbm2ddl.auto", "update");
		configuration = configuration.setProperty("hibernate.connection.autocommit", "false");
		configuration = configuration.setProperty("hibernate.max_fetch_depth", "3");
		configuration = configuration.setProperty("hibernate.show_sql", "false");
		
		setSessionFactory(configuration.buildSessionFactory());
	}
	
	public static void dbCleanerInitialize() {
		Configuration configuration = new Configuration();
//		configuration = configuration.addClass(ActionHistory.class);
//		configuration = configuration.addClass(AttendenceHistory.class);
//		configuration = configuration.addClass(CashDrawerResetHistory.class);
//		configuration = configuration.addClass(CookingInstruction.class);
//		configuration = configuration.addClass(CouponAndDiscount.class);
//		configuration = configuration.addClass(Gratuity.class);
//		configuration = configuration.addClass(MenuCategory.class);
//		configuration = configuration.addClass(MenuGroup.class);
//		configuration = configuration.addClass(MenuItem.class);
//		configuration = configuration.addClass(MenuItemModifierGroup.class);
//		configuration = configuration.addClass(MenuItemShift.class);
//		configuration = configuration.addClass(MenuModifier.class);
//		configuration = configuration.addClass(MenuModifierGroup.class);
//		configuration = configuration.addClass(PayoutReason.class);
//		configuration = configuration.addClass(PayoutRecepient.class);
//		configuration = configuration.addClass(Restaurant.class);
//		configuration = configuration.addClass(RestaurantTable.class);
//		configuration = configuration.addClass(Shift.class);
//		configuration = configuration.addClass(Tax.class);
//		configuration = configuration.addClass(Terminal.class);
//		configuration = configuration.addClass(Ticket.class);
//		configuration = configuration.addClass(TicketCouponAndDiscount.class);
//		configuration = configuration.addClass(TicketItem.class);
//		configuration = configuration.addClass(TicketItemModifier.class);
//		configuration = configuration.addClass(TicketItemModifierGroup.class);
//		configuration = configuration.addClass(PosTransaction.class);
		configuration = configuration.addClass(User.class);
//		configuration = configuration.addClass(VoidReason.class);
//		configuration = configuration.addClass(DrawerPullReport.class);
//		configuration = configuration.addClass(PrinterConfiguration.class);
		configuration = configuration.addClass(UserPermission.class);
		configuration = configuration.addClass(UserType.class);
                //configuration = configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
		//configuration = configuration.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.ClientDriver");
		configuration = configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		configuration = configuration.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
                configuration = configuration.setProperty("hibernate.connection.url", ApplicationConfig.getConnectionURL() + ";create=true");
		configuration = configuration.setProperty("hibernate.connection.username", ApplicationConfig.getDatabaseUser());
		configuration = configuration.setProperty("hibernate.connection.password", ApplicationConfig.getDatabasePassword());
		configuration = configuration.setProperty("hibernate.hbm2ddl.auto", "create");
		configuration = configuration.setProperty("hibernate.connection.autocommit", "false");
		configuration = configuration.setProperty("hibernate.max_fetch_depth", "3");
		configuration = configuration.setProperty("hibernate.show_sql", "false");
		
		setSessionFactory(configuration.buildSessionFactory());
	}
}