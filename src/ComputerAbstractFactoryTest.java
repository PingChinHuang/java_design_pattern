import com.journaldev.abstractfactory.ComputerFactory;
import com.journaldev.abstractfactory.PCFactory;
import com.journaldev.abstractfactory.ServerFactory;
import com.journaldev.factory.Computer;

/**
 * 
 */

/**
 * @author superod
 *
 */
public class ComputerAbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		
		System.out.println("Abstract Factory PC::" + pc);
		System.out.println("Abstract Factory Server::" + server);

	}

}
