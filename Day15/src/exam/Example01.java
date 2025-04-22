package exam;

class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.err.println(this.color);
		showPoint();
	}
}


public class Example01 {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setX(30);
		cp.setY(40);
		cp.setColor("검은색");
		cp.showColorPoint();
		
	}
}
