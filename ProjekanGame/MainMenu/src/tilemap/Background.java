package tilemap;

import main.GamePanel;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.ImageIO;

public class Background {
	
	private BufferedImage image;
	
	private double x;
	private double y;
	private double dx;
	private double dy;
	
	private double moveScale;
	
	public Background(String s, double ms) {
		
		try {
			image = ImageIO.read(
				getClass().getResourceAsStream(s)
			);
			moveScale = ms;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void setPosition(double x, double y) {
		this.x = (x * moveScale) % GamePanel.WIDTH;
//		this.x = (x * moveScale) % 320;
		this.y = (y * moveScale) % GamePanel.HEIGHT;
//		this.y = (y * moveScale) % 240;
	}
	
	public void setVector(double dx, double dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void draw(Graphics2D g) {
		
		g.drawImage(image, (int)x, (int)y, 450, 240, null);
		
		if(x < 0) {
			g.drawImage(
				image,
				(int)x + 420,
				(int)y,
				450, 
				240,
				null
			);
		}
		if(x > 0) {
			g.drawImage(
				image,
				(int)x - 420,
				(int)y,
				450, 
				240,
				null
			);
		}
	}
	
}







