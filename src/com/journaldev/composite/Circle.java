/**
 * 
 */
package com.journaldev.composite;

/**
 * @author superod
 *
 */
public class Circle implements Shape {

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Circle with Color " + fillColor);
	}

}
