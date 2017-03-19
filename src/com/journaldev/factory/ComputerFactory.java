/**
 * 
 */
package com.journaldev.factory;

import com.journaldev.factory.Computer;
import com.journaldev.factory.PC;
import com.journaldev.factory.Server;

/**
 * @author superod
 *
 */
public class ComputerFactory {
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) return new PC(ram, cpu, hdd);
		else if ("Server".equalsIgnoreCase(type)) return new Server(ram, cpu, hdd);
		
		return null;
	}
	
}
