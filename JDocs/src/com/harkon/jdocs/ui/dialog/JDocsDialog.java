package com.harkon.jdocs.ui.dialog;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JFrame;

import com.harkon.jdocs.main.Application;
import com.harkon.jdocs.swing.GlassPane;

public class JDocsDialog extends JDialog {

    protected boolean canceled = true;
    private GlassPane glassPane;

    public JDocsDialog() throws HeadlessException {
        super(Application.getJDocsWindow(), true);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        glassPane = new GlassPane();
        setGlassPane(glassPane);

        initUI();
    }

    public JDocsDialog(Dialog owner, boolean modal) {
        super(owner, modal);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        glassPane = new GlassPane();
        setGlassPane(glassPane);

        initUI();
    }

    public JDocsDialog(Dialog owner, String title, boolean modal) {
        super(owner, title, modal);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        glassPane = new GlassPane();
        setGlassPane(glassPane);

        initUI();
    }

    public JDocsDialog(Frame owner, boolean modal) throws HeadlessException {
        super(owner, modal);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        glassPane = new GlassPane();
        setGlassPane(glassPane);

        initUI();
    }

    public JDocsDialog(Frame owner, boolean modal, boolean unDecorated) throws HeadlessException {
        super(owner, modal);
        //setUndecorated(unDecorated);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        glassPane = new GlassPane();
        setGlassPane(glassPane);
        initUI();
    }

    protected void initUI() {
    }

    public void open() {
        canceled = false;
        if (isUndecorated()) {
            Window owner = getOwner();
            if (owner instanceof JFrame) {
                JFrame frame = (JFrame) owner;
                setLocationRelativeTo(frame.getContentPane());
            } else {
                setLocationRelativeTo(owner);
            }

        } else {
            setLocationRelativeTo(getOwner());
        }
        setVisible(true);
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public void setGlassPaneVisible(boolean b) {
        glassPane.setVisible(b);
    }
}
