/**
 * 
 */
package com.journaldev.singleton;

/**
 * @author superod
 *
 */
public class ThreadSafeSingletone {
	private static ThreadSafeSingletone instance;
	
	private ThreadSafeSingletone() {}
	
	public static synchronized ThreadSafeSingletone GetInstance() {
		if (instance == null)
			instance = new ThreadSafeSingletone();
		
		return instance;
	}
	
	public static ThreadSafeSingletone GetInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingletone.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletone();
				}
			}
		}
		
		return instance;
	}

}
