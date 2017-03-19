/**
 * 
 */
package com.journaldev.singleton;

/**
 * @author superod
 *
 */
public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in createing singleton instance");
		}
	}
	
	public static StaticBlockSingleton GetInstance() {
		return instance;
	}
}
