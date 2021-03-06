
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Spawner extends MovingThing {
	private int speed;
	private Image image;

	public Spawner() {
		this(0, 0, 0);
	}

	public Spawner(int x, int y) {
		this(x, y, 0);
	}

	public Spawner(int x, int y, int s) {
		super(x, y);
		speed = s;
		try {
			image = ImageIO.read(new File("C:/Users/ant3384/Desktop/APCSA - Workspace/APCSA-Labs/Unit 17/src/bug.JPG"));
		} catch (Exception e) {
			// feel free to do something here
		}
	}

	public void setSpeed(int s) {
		// add code
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void moreAliens() {

		int x = (int) (Math.random() * 800);
		int y = (int) (Math.random() * (400));
		Alien a = new Alien(x,y,speed);
		}
	

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}

	public String toString() {
		return "";
	}
}

