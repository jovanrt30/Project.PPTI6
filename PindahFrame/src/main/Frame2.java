package main;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Frame2 extends JFrame{

	public Frame2() {
		setSize(MainFrame.WIDTH, MainFrame.HEIGHT);
		setLayout(new FlowLayout());
		add(new Panel1Frame2());
		add(new Panel2Frame2(this));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
