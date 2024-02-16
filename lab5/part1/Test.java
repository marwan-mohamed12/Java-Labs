import java.util.List;
public class Test {
	
	public void drawShapes(List <? extends Shape> listOfShapes) {
		for (Shape s: listOfShapes) {
			s.draw();
		}
	}
	
}