
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		// add code
		super.setPos(x, y);
	}

	public Ammo(int x, int y, int s) {
		// add code
		super.setPos(x, y);
		speed = s;

	}

	public void setSpeed(int s) {
		// add code
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.yellow);
		window.fillRect(getX(), getY(), 5, 5); // add code to draw the ammo
	}

	public String toString() {
		return "";
	}
}
