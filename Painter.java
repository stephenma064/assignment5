/* CRITTERS GUI <Painter.java>
 * EE422C Project 4b submission by
 * Replace <...> with your actual data.
 * Stephen Ma
 * szm99
 * 16480
 * Slip days used: <1>
 * Eric Su
 * es25725
 * 16475
 * Slip days used: <2>
 * Fall 2016
 */
package assignment5;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import static assignment5.Main.grid;

public class Painter {

	/*
	 * Returns a square or a circle, according to shapeIndex
	 */
	static Shape getIcon(int shapeIndex) {
		Shape s = null;
		int size = 100;
		
		switch(shapeIndex) {
		case 0: s = new Rectangle(size, size); 
			s.setFill(javafx.scene.paint.Color.RED); break;
		case 1: s = new Circle(size/2); 
			s.setFill(javafx.scene.paint.Color.GREEN); break;
		}
		// set the outline of the shape
		s.setStroke(javafx.scene.paint.Color.BLUE); // outline
		return s;
	}
	
	/*
	 * Paints the shape on a grid.
	 */
	public static void paint() {
		grid.getChildren().clear(); // clean up grid.
		int temp = 5;
		for (int i = 0; i < temp; i ++) {
			for (int j = 0; j < temp; j ++) {
                grid.add(getIcon(1),i,j);
            }
		}
	}
}
