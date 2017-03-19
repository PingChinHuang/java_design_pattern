/**
 * 
 */
package com.journaldev.singleton;

import java.io.Serializable;

/**
 * @author superod
 *
 */
public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = -7604766932017737115L;
	
	private SerializedSingleton() {}
	
	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public static SerializedSingleton GetInstance() {
		return SingletonHelper.instance;
	}
	
	// To overcome the issue when deserializing.
	protected Object readResolve() {
		return GetInstance();
	}
}
