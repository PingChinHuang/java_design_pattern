/**
 * 
 */
import com.journaldev.singleton.*;
import java.lang.reflect.Constructor;

/**
 * @author superod
 *
 */
public class ReflectionSingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BillPughSingleton instanceOne = BillPughSingleton.GetInstance();
		BillPughSingleton instanceTwo = null;
		BillPughSingleton instanceThree = BillPughSingleton.GetInstance();
		
		try {
			Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
			for (Constructor constructor: constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (BillPughSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println(instanceThree.hashCode());
	}

}
