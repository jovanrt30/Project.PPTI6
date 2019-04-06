package main;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	
	
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}
	
	public MainFrame() {
		setSize(WIDTH , HEIGHT);
		setLayout(new FlowLayout());
		add(new Panel1Frame1());
		add(new Panel2Frame1(this));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
