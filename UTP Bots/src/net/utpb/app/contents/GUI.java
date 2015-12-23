package net.utpb.app.contents;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	JButton buttonTest;

	public GUI() {
		initFrame();
	}

	public void initFrame() {
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
