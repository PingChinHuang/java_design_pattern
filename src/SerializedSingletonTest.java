import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.journaldev.singleton.SerializedSingleton;

/**
 * 
 */

/**
 * @author superod
 *
 */
public class SerializedSingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SerializedSingleton instanceOne = SerializedSingleton.GetInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		// Deserialization will create a new instance of the class.
		// It destroy the singleton pattern.
		System.out.println("instanceOne hashCode = " + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode = " + instanceTwo.hashCode());
		
	}

}
