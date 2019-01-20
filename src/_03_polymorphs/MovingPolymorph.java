package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph {

	MovingPolymorph(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, width, height);
	}

	
}
