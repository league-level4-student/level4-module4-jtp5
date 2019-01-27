package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 1000;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> list = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.addMouseListener(this);
		window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		list.add(new BluePolymorph(50, 50, 50, 50));
		list.add(new RedPolymorph(150, 150, 100, 100));
		list.add(new MovingPolymorph(350, 350, 100, 100));
		list.add(new CirclePolymorph(500, 100, 100, 100));
		list.add(new MousePolymorph(400, 400, 100, 100));
		list.add(new MessagePolymorph(700, 200, 100, 100));

		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		// draw polymorph
		for (int i = 0; i < list.size(); i++) {
			list.get(i).draw(g);
			list.get(i).update();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
		if (e.getX() >= list.get(5).getX() && e.getX() <= list.get(5).getX() + list.get(5).getWidth()
				&& e.getY() >= list.get(5).getY() && e.getY() <= list.get(5).getY() + list.get(5).getHeight()) {
			JOptionPane.showMessageDialog(null, "test");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
