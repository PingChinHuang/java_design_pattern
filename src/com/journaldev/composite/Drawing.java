/**
 * 
 */
package com.journaldev.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author superod
 *
 */
public class Drawing implements Shape {
	private List<Shape> shapes = new ArrayList<Shape>();

	/**
	 * 
	 */
	public Drawing() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.journaldev.composite.Shape#draw(java.lang.String)
	 */
	@Override
	public void draw(String fillColor) {
		for (Shape sh : shapes) {
			sh.draw(fillColor);
		}
	}

	public void add(Shape s) {
		this.shapes.add(s);
	}
	
	public void remove(Shape s) {
		this.shapes.remove(s);
	}
	
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
