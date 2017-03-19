/**
 * 
 */
package com.journaldev.abstractfactory;

import com.journaldev.factory.Computer;
import com.journaldev.factory.Server;

/**
 * @author superod
 *
 */
public class ServerFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	/**
	 * 
	 */
	public ServerFactory(String ram, String hdd, String cpu) {
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
		return new Server(ram, hdd, cpu);
	}

}
