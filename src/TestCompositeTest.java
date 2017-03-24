import com.journaldev.composite.Circle;
import com.journaldev.composite.Drawing;
import com.journaldev.composite.Shape;
import com.journaldev.composite.Triangle;

/**
 * 
 */

/**
 * @author superod
 *
 */
public class TestCompositeTest {

	/**
	 * 
	 */
	public TestCompositeTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape triangle = new Triangle();
		Shape triangle1 = new Triangle();
		Shape circle = new Circle();
		Drawing drawing = new Drawing();
		
		drawing.add(triangle);
		drawing.add(triangle);
		drawing.add(circle);
		
		drawing.draw("Red");
		drawing.clear();
		
		drawing.add(triangle1);
		drawing.add(circle);
		
		drawing.draw("Green");
		drawing.clear();
	}

}
