/**
 * 
 */
package com.journaldev.abstractfactory;

import com.journaldev.factory.Computer;
import com.journaldev.factory.PC;

/**
 * @author superod
 *
 */
public class PCFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	/**
	 * 
	 */
	public PCFactory(String ram, String hdd, String cpu) {
		// TODO Auto-generated constructor stub
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	/* (non-Javadoc)
	 * @see com.journaldev.abstractfactory.ComputerAbstractFactory#createComputer()
	 */
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, hdd, cpu);
	}

}
