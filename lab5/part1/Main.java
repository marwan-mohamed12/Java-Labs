import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]){
		
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle());
		
		ArrayList<Shape> circles = new ArrayList<Shape>();
		circles.add(new Circle());
		
		Test test = new Test();
		
		test.drawShapes(rectangles);
		test.drawShapes(circles);
		
		
	}
	
}