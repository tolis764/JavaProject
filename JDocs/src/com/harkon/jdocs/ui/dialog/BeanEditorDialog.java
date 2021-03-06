/*
 * OkCancelDialog.java
 *
 */
package com.harkon.jdocs.ui.dialog;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import com.harkon.jdocs.ui.BeanEditor;

/**
 *
 * @author  MShahriar
 */
public class BeanEditorDialog extends javax.swing.JDialog implements WindowListener {

    protected BeanEditor beanEditor;
    private boolean canceled = false;

    /** Creates new form OkCancelDialog */
    public BeanEditorDialog(java.awt.Frame parent, boolean modal) {
        this(null, parent, modal);
    }

    public BeanEditorDialog(BeanEditor beanEditor, java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();

        setBeanEditor(beanEditor);

        addWindowListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new com.harkon.jdocs.ui.TitlePanel();
        beanEditorContainer = new com.harkon.jdocs.swing.TransparentPanel();
        jPanel1 = new com.harkon.jdocs.swing.TransparentPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new com.harkon.jdocs.swing.TransparentPanel();
        btnOk = new com.harkon.jdocs.swing.JDocsButton();
        btnCancel = new com.harkon.jdocs.swing.JDocsButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().add(titlePanel, java.awt.BorderLayout.PAGE_START);

        beanEditorContainer.setLayout(new java.awt.BorderLayout());
        getContentPane().add(beanEditorContainer, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jSeparator1, java.awt.BorderLayout.PAGE_END);

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performOk(evt);
            }
        });
        jPanel2.add(btnOk);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                performCancel(evt);
            }
        });
        jPanel2.add(btnCancel);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void performOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performOk
        if (beanEditor == null) {
            return;
        }
        boolean saved = beanEditor.save();
        if (saved) {
            dispose();
        }
    }//GEN-LAST:event_performOk

    private void performCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_performCancel
        canceled = true;
        dispose();
    }//GEN-LAST:event_performCancel

    @Override
    public void dispose() {
        if (beanEditor != null) {
            beanEditor.dispose();
            beanEditor = null;
        }

        super.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.harkon.jdocs.swing.TransparentPanel beanEditorContainer;
    private com.harkon.jdocs.swing.JDocsButton btnCancel;
    private com.harkon.jdocs.swing.JDocsButton btnOk;
    private com.harkon.jdocs.swing.TransparentPanel jPanel1;
    private com.harkon.jdocs.swing.TransparentPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private com.harkon.jdocs.ui.TitlePanel titlePanel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setTitle(String title) {
        super.setTitle(title);

        titlePanel.setTitle(title);
    }

    public void open() {
        canceled = false;
        this.pack();
        this.setLocationRelativeTo(this.getOwner());
        super.setVisible(true);
    }

    public boolean isCanceled() {
        return canceled;
    }

    public Frame getParentFrame() {
        return (Frame) getOwner();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        performCancel(null);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    public BeanEditor getBeanEditor() {
        return beanEditor;
    }

    public Object getBean() {
        if (beanEditor != null) {
            return beanEditor.getBean();
        }
        return null;
    }

    public void setBean(Object bean) {
        if (beanEditor != null) {
            beanEditor.setBean(bean);
        }
    }

    public void setBeanEditor(BeanEditor beanEditor) {
        if (this.beanEditor != beanEditor) {
            this.beanEditor = beanEditor;
            beanEditorContainer.removeAll();

            if (beanEditor != null) {
                beanEditor.setEditorDialog(this);
                beanEditorContainer.add(beanEditor);
                setTitle(beanEditor.getDisplayText());
            }
            beanEditorContainer.revalidate();
        }
    }
}
