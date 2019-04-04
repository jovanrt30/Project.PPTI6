package gameProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameDesign extends JFrame {
	ImageIcon background = new ImageIcon("beach.JPG");
	ImageIcon playerA = new ImageIcon("playerA.PNG");
	ImageIcon playerB = new ImageIcon("archer.PNG");
	ImageIcon cloud1 = new ImageIcon("cloudy.PNG");
	ImageIcon nett = new ImageIcon("tulalit.PNG");
	ImageIcon bom = new ImageIcon("bom.PNG");
	
	//for player A
	int playeraW;
	int playeraH;
	int xA = 0;
	
	//for player B
	int playerB_width;
	int playerB_Height;
	int xB = 0;
	
	//for net
	int netWidth;
	int netHeight;
	
	Rectangle playerAr = new Rectangle();
	Rectangle playerBr = new Rectangle();
	Rectangle cloudr = new Rectangle();
	//ini net
	Rectangle net = new Rectangle(440, 300, 10, 200);
	
	Rectangle lives_a = new Rectangle(80, 100, 300, 20);
	int lifesA = 150;
	Rectangle lives_a_avalaible = new Rectangle(80, 100, 300, 20);

	Rectangle lives_b = new Rectangle(520, 100, 300, 20);
	int lifesB = 200;
	Rectangle lives_b_avalaible = new Rectangle(520, 100, 300, 20);

	public GameDesign() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(900, 600);
		setVisible(true);
		cloudr.y = 50;
		
		//player A(kiri)
		playeraW = playerA.getIconWidth() / 4;
		playeraH = playerA.getIconHeight() / 2;

		playerAr.x = 50;
		playerAr.y = 350;
		playerAr.width = playeraW;
		playerAr.height =  playeraH;
		
		//player B(kanan)
		playerB_Height = playerB.getIconHeight() / 2;
		playerB_width = playerB.getIconWidth() / 4;
		
		playerBr.x = 650;
		playerBr.y = 350;
		playerBr.width = playerB_width;
		playerBr.height = playerB_Height;
		
		
		th.start();
		th2.start();
	}

	Thread th = new Thread(() -> {
		while (true) {
			cloudr.x += 5;
			if (cloudr.x > 850) {
				while (true) {
					cloudr.x -= 5;
					if (cloudr.x == 0)
						break;
				}
			}

			repaint();

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});

	Thread th2 = new Thread(() -> {
		while (true) {
			xA++;
			xA %= 2;

			xB++;
			xB %= 2;
			repaint();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});

	@Override
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		g.drawImage(cloud1.getImage(), cloudr.x, cloudr.y, 200, 100, null);
		g.drawImage(cloud1.getImage(), (cloudr.x) + 300, cloudr.y, 100, 50, null);
		g.drawImage(cloud1.getImage(), (cloudr.x) + 600, cloudr.y, 200, 100, null);
		g.drawImage(cloud1.getImage(), (cloudr.x) + 800, cloudr.y, 100, 50, null);
		g.drawImage(playerA.getImage(), playerAr.x, playerAr.y, playerAr.x + playeraW, playerAr.y + playeraH,
				xA * playeraW, 0, (xA * playeraW) + playeraW, playeraH, null);
		g.setColor(Color.blue);
		g.drawImage(playerB.getImage(), playerBr.x, playerBr.y, playerBr.x + playerB_width, playerBr.y + playerB_Height, 
				xB * playerB_width, 0,(xB*playerB_width) + playerB_width, playerB_Height, null);
		
//  g.fillRect(a.x, a.y, a.width, a.height);
//		g.setColor(Color.RED);
//		g.fillRect(b.x, b.y, b.width, b.height);
		
		//disini
		
		g.drawImage(nett.getImage(), net.x, net.y+5, 80, 650,null);	

//  text
		g.setColor(Color.RED);
		g.drawString("LIVES", 100, 140);
		g.setColor(Color.RED);
		g.drawString("LIVES", 540, 140);

//  lives
		g.setColor(Color.white);
		g.fillRect(lives_a_avalaible.x, lives_a_avalaible.y, lives_a_avalaible.width, lives_a_avalaible.height);
		g.setColor(Color.white);
		g.fillRect(lives_b_avalaible.x, lives_b_avalaible.y, lives_b_avalaible.width, lives_b_avalaible.height);
		g.setColor(Color.red);
		g.fillRect(lives_a.x, lives_a.y, lifesA, lives_a.height);
		g.setColor(Color.red);
		g.fillRect(lives_b.x, lives_b.y, lifesB, lives_b.height);
		
//		bom
		g.drawImage(bom.getImage(), 180, 120, 50, 50, null);
	}

	public static void main(String[] args) {
		new GameDesign();
	}
}