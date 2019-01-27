package _03_polymorphs;

import java.awt.Graphics;
import java.awt.MouseInfo;

public abstract class Polymorph {
	int x;
	int y;
	int width;
	int height;
	int angle;

	Polymorph(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
		angle = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int num) {
		x = num;
	}

	public int getY() {
		return y;
	}

	public void setY(int num) {
		y = num;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void update() {
		if (this instanceof MovingPolymorph) {
			x -= 1;
		}

		if (this instanceof CirclePolymorph) {
			angle++;
			if (angle > 360)
				angle = 0;
			x = x + (int) (Math.cos(Math.toRadians(angle)) * 5);
			y = y + (int) (Math.sin(Math.toRadians(angle)) * 5);
		}

		if (this instanceof MousePolymorph) {
			setX((int) (MouseInfo.getPointerInfo().getLocation().getX()));
			setY((int) (MouseInfo.getPointerInfo().getLocation().getY()));
		}

	}

	public abstract void draw(Graphics g);
}
