import java.awt.Color;
import java.awt.Graphics;


public class Turret {
	
	private int x;
	private int y;
	private int radius;
	private int range;
	
	Turret(int xPos, int yPos, int r, int ran) {
		x = xPos;
		y = yPos;
		radius = r;
		range = ran;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int newRange) {
		range = newRange;
	}
	public void setX(int input) {
		x = input;
	}
	public void setY(int input) {
		y = input;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x + range/2, y + range/2, radius, radius);
		
		//Drawing turret range
		g.drawOval(x, y, range, range);
	}

}
