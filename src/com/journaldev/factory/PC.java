/**
 * 
 */
package com.journaldev.factory;

/**
 * @author superod
 *
 */
public class PC extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String cpu, String hdd) {
		this.ram = ram;
		this.cpu = cpu;
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
