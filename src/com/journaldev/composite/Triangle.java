/**
 * 
 */
package com.journaldev.composite;

/**
 * @author superod
 *
 */
public class Triangle implements Shape {

	/**
	 * 
	 */
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.journaldev.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing Triangle with Color " + fillColor);

	}

}
