
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		xSpeed = 2;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, int xSped, int ySped) {
		super(x, y, width, height);
		xSpeed = xSped;
		ySpeed = ySped;
	}

	public Ball(int x, int y, int width, int height, Color col) {
		super(x, y, width, height, col);
		xSpeed = 2;
		ySpeed = 1;
	}

	public Ball(int x, int y, int width, int height, Color col, int xSped, int ySped) {
		super(x, y, width, height, col);
		xSpeed = xSped;
		ySpeed = ySped;
	}

	// add the other Ball constructors
	public void setX(int x) {
		super.setX(x);
	}

	public void setY(int y) {
		super.setY(y);
	}

	public void setWidth(int width) {
		super.setY(width);
	}

	public void setHeight(int height) {
		super.setY(height);
	}

	public void setXSpeed(int xSpeedr) {
		xSpeed = xSpeedr;
	}

	public void setYSpeed(int ySpeedr) {
		ySpeed = ySpeedr;
	}
	// add the set methods

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		super.draw(window, Color.white);
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		super.draw(window);
	}
	// draw the ball at its new location

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else
			return false;
	}

	// add the get methods
	public int getX() {
		return super.getX();
	}

	public int getY() {
		return super.getY();
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public int getWidth() {
		return super.getWidth();
	}

	public int getHeight() {
		return super.getHeight();
	}

	public Color getColor() {
		return super.getColor();
	}

	// add a toString() method
	public String toString() {
		return "x - " + getX() + " y - " + getY() + " width - " + getWidth() + " height - " + getHeight() + " Color - "
				+ getColor() + " xSpeed - " + getXSpeed() + " ySpeed - " + getYSpeed();
	}
}