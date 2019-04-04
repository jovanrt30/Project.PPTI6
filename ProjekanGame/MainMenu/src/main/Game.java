package main;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("SUSUTAWW");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setResizable(true);
		window.pack();
		window.setVisible(true);
		
	} 

}
