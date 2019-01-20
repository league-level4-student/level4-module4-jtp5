package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
    Polymorph(int x, int y, int w, int h){
   	 this.x = x;
   	 this.y = y;
   	 width = w;
   	 height = h;
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
    
    public void update(){
    	if(this instanceof MovingPolymorph) {
        	x -= 1;
    		}
    	
    	if(this instanceof CirclePolymorph) {
    		x += (int)Math.cos(x);
    		y += (int)Math.sin(y);
    	}
    	
    }
    
    public abstract void draw(Graphics g);
}
