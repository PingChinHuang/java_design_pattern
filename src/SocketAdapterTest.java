import com.journaldev.adapter.SocketAdapter;
import com.journaldev.adapter.SocketClassAdapterImpl;
import com.journaldev.adapter.SocketObjectAdapterImpl;
import com.journaldev.adapter.Volt;

/**
 * 
 */

/**
 * @author superod
 *
 */
public class SocketAdapterTest {

	/**
	 * 
	 */
	public SocketAdapterTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SocketAdapter classAdapter = new SocketClassAdapterImpl();
		SocketAdapter objectAdapter = new SocketObjectAdapterImpl();
		
		System.out.println("Class Adapter 3V: " + getVolt(classAdapter, 3).getVolts());
		System.out.println("Class Adapter 12V: " + getVolt(classAdapter, 12).getVolts());
		System.out.println("Class Adapter 120V: " + getVolt(classAdapter, 120).getVolts());
		
		System.out.println("Object Adapter 3V: " + getVolt(objectAdapter, 3).getVolts());
		System.out.println("Object Adapter 12V: " + getVolt(objectAdapter, 12).getVolts());
		System.out.println("Object Adapter 120V: " + getVolt(objectAdapter, 120).getVolts());

	}
	
	private static Volt getVolt(SocketAdapter adapter, int volt) {
		switch (volt) {
		case 3:
			return adapter.get3Volt();
		case 12:
			return adapter.get12Volt();
		case 120:
			return adapter.get120Volt();
		}
		
		return adapter.get120Volt();
	}

}
