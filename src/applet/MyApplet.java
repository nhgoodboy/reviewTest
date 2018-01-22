package applet;

import java.awt.Graphics;

import javax.swing.JApplet;

public class MyApplet extends JApplet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawString("Hello World", 50, 50);
	}
}
