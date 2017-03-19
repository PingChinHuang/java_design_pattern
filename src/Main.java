/**
 * 
 */
import com.journaldev.singleton.*;

/**
 * @author superod
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EagerInitializationSingleton eagerInitSingleton = EagerInitializationSingleton.GetInstance();
		System.out.println(eagerInitSingleton.value);
	}

}
