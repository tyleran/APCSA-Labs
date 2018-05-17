
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class BallTestTwo extends Canvas implements Runnable {
	private Ball ball;

	public BallTestTwo() {
		setBackground(Color.WHITE);
		setVisible(true);

		// instantiate a new Ball
		ball = new Ball(100, 100, 30, 50, Color.BLUE);

		// test the Ball thoroughly

		// test all constructors

		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		ball.moveAndDraw(window);

		if (!(ball.getX() >= 10 && ball.getX() <= 760)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (!(ball.getY() >= 10 && ball.getY() <= 530)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(19);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}