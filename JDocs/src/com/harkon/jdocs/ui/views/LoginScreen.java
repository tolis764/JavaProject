/*
 * LoginScreen.java
 *
 * Created on March 15 2014, 10:45:55 PM
 */
package com.harkon.jdocs.ui.views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import net.miginfocom.swing.MigLayout;

import com.harkon.jdocs.IconFactory;

/**
 *
 * @author  HaRRiSK
 */
public class LoginScreen extends JPanel {

    public final static String VIEW_NAME = "LOGIN_VIEW";
    private JLabel imageComponent;
    private PasswordScreen passwordScreen;

    /** Creates new form LoginScreen */
    public LoginScreen() {
        setLayout(new MigLayout("ins 20 10 20 10, fill", "[fill,growprio 100,grow][]", ""));

        imageComponent = new JLabel(IconFactory.getIcon("jdocs.png"));
        imageComponent.setBorder(new EtchedBorder());

        add(imageComponent, "spany,grow,flowx");

        passwordScreen = PasswordScreen.getInstance();
        passwordScreen.setBorder(new CompoundBorder(new EtchedBorder(), new EmptyBorder(5, 5, 12, 5)));
        add(passwordScreen, "width 200,growy 100");
    }

    @Override
    public void setVisible(boolean aFlag) {
        if (aFlag) {
            PasswordScreen.getInstance().setUserTypes();
        }
        super.setVisible(aFlag);
    }
}
