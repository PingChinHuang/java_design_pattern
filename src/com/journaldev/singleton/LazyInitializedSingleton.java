/**
 * 
 */
package com.journaldev.singleton;

/**
 * @author superod
 *
 */
public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {}
	
	public static LazyInitializedSingleton GetInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		
		return instance;
	}

}
