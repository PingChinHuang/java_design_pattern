/**
 * 
 */
package com.journaldev.factory;

/**
 * @author superod
 *
 */
public class Server extends Computer {
	
	private String ram;
	private String cpu;
	private String hdd;

	/**
	 * 
	 */
	public Server(String ram, String cpu, String hdd) {
		// TODO Auto-generated constructor stub
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	/* (non-Javadoc)
	 * @see com.journaldev.factory.Computer#getRAM()
	 */
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	/* (non-Javadoc)
	 * @see com.journaldev.factory.Computer#getHDD()
	 */
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	/* (non-Javadoc)
	 * @see com.journaldev.factory.Computer#getCPU()
	 */
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
