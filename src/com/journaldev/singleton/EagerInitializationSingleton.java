/**
 * 
 */
package com.journaldev.singleton;

/**
 * @author superod
 *
 */
public class EagerInitializationSingleton {
	public int value = 2;
	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
	
	private EagerInitializationSingleton() {}
	
	public static EagerInitializationSingleton GetInstance() {
		return instance;
	}
}
