package com.harkon.jdocs.swing;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.harkon.jdocs.config.UIConfig;

public class JDocsButton extends JButton {

    public static Border border = new LineBorder(Color.BLACK, 1);
    static Insets margin = new Insets(1, 1, 1, 1);
    static JDocsButtonUI ui = new JDocsButtonUI();

    static {
        UIManager.put("JDocsButtonUI", "com.harkon.jdocs.swing.JDocsButtonUI");
    }

    public JDocsButton() {
        this(null);
    }

    public JDocsButton(String text) {
        super(text);
        setFont(UIConfig.getButtonFont());

        setFocusPainted(false);
        setMargin(margin);
    }

    @Override
    public String getUIClassID() {
        return "JDocsButtonUI";
    }
}
