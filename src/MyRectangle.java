import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle {
	private int x;
	private int y;
	private int w;
	private int h;
	private boolean filled;
	private Color color;
	
	public MyRectangle() {
		x = 0;
		y = 0;
		w = 0;
		h = 0;
		filled = false;
		color = Color.BLACK;
	}
	
	public MyRectangle(int x, int y, int w, int h, boolean filled, Color color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.filled = filled;
		this.color = color;
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		if (filled) {
			g.fillRect(x, y, w, h);
		} else {
			g.drawRect(x, y, w, h);
		}
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setW(int w) {
		this.w = w;
	}
	
	public void setH(int h) {
		this.h = h;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getW() {
		return w;
	}
	
	public int getH() {
		return h;
	}
	
	public boolean getFilled() {
		return filled;
	}
	
	public Color getColor() {
		return color;
	}
}
