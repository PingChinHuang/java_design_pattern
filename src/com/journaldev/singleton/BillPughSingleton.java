/**
 * 
 */
package com.journaldev.singleton;

/**
 * @author superod
 * 
 * To handle the issue which too many threads want to get the instance of the Singleton class
 * simultaneously.
 */
public class BillPughSingleton {
	private BillPughSingleton() {}
	
	/* Static class won't be loaded into memory until GetInstance is called. */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton GetInstance() {
		return SingletonHelper.INSTANCE;
	}
}
