/**
 * 
 */
package com.journaldev.abstractfactory;

import com.journaldev.factory.Computer;

/**
 * @author superod
 *
 */
public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
