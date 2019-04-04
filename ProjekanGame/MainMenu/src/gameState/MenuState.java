package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import tilemap.Background;

public class MenuState extends GameState {

	private Background bg;

	private int currChoice = 0;

	private String[] options = { "Start", "Quit" };

	private Color titleColor;
	private Font titleFont;

	private Font font;

	public MenuState(GameStateManager gsm) {
		this.gsm = gsm;

		try {
			bg = new Background("/Backgrounds/city.png", 1);
			bg.setVector(-0.1, 0);

			titleColor = new Color(10, 100, 20);
			titleFont = new Font("Arial Black", Font.PLAIN, 28);
			font = new Font("Arial", Font.PLAIN, 12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void init() {}

	public void update() {
		bg.update();
	}

	public void draw(Graphics2D g) {
		bg.draw(g);

		// draw title
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("Suting Suting AWW AWW", 25, 70);

		// draw menu
		g.setFont(font);
		for (int i = 0; i < options.length; i++) {
			if (i == currChoice) {
				g.setColor(Color.RED);
			} else {
				g.setColor(Color.BLACK);
			}
			g.drawString(options[i], 145, 140 + i * 15);
		}
	}


	private void select() {
		if(currChoice == 0) {
			//start
		}
		if(currChoice == 1) {
			System.exit(0);
		}
	}
	
	public void keyPressed(int k) {
		if(k==KeyEvent.VK_ENTER) {
			select();
		}
		if(k == KeyEvent.VK_W || k == KeyEvent.VK_UP) {
			currChoice--;
			if(currChoice == -1) {
				currChoice = options.length - 1 ;
			}
		}
		if(k == KeyEvent.VK_S || k == KeyEvent.VK_DOWN) {
			currChoice++;
			if(currChoice == options.length) {
				currChoice = 0 ;
			}
			
		}
	}

	public void keyReleased(int k) {}
}
