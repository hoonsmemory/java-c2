package paint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(10);
		
		drawPaint(p1);
		p1.show(false);
		
		Point p2 = new Point(100,200);
		drawPaint(p2);
		
		ColorPoint cp1 = new ColorPoint();
		cp1.setX(300);
		cp1.setY(200);
		((ColorPoint)cp1).setColor("Yellow");
		drawPaint(cp1);//cp1.show();
		
	}
	
	public static void drawPaint(Point point) {
		point.show();
	}

	
}
