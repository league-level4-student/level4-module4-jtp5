package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> list = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	list.add(new BluePolymorph(50, 50, 50, 50));
   	list.add(new RedPolymorph(150, 150, 100, 100));
   	list.add(new MovingPolymorph(350, 350, 100, 100));
   	list.add(new CirclePolymorph(500, 500, 100, 100));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, WIDTH, HEIGHT);
   	
   	 //draw polymorph
   	 for (int i = 0; i < list.size(); i++) {
		list.get(i).draw(g);
		list.get(i).update();
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
    }
}
