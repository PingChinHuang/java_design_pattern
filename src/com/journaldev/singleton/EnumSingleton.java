/**
 * 
 */
package com.journaldev.singleton;

/**
 * @author superod
 *
 * To overcom the situation with Reflection.
 * 
 * Any enum value is instantiated only once in Java program.
 * Java Enum values are globally accessible, so is the singleton.
 * 
 * Drawback:
 *   Not allow lazy initialization.
 */
public enum EnumSingleton {
	INSTANCE;
	
	public static void doSomething() {
		
	}
}
