/**
 * 
 */
package com.journaldev.abstractfactory;

import com.journaldev.factory.Computer;

/**
 * @author superod
 *
 */
public interface ComputerAbstractFactory {
	
	// returning an instance of super class Computer
	public Computer createComputer();
}
