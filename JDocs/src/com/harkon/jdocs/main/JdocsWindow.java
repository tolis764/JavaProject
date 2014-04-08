package com.harkon.jdocs.main;

import javax.swing.JFrame;

import com.harkon.jdocs.swing.GlassPane;

public class JdocsWindow extends JFrame {
	private GlassPane glassPane;
	
	public JdocsWindow() {
		glassPane = new GlassPane();
		glassPane.setOpacity(0.6f);
		setGlassPane(glassPane);
	}
	
	public void setGlassPaneVisible(boolean b) {
		glassPane.setVisible(b);
	}
}
