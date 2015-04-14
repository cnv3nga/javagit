package Tutor;
/**
 * This program define the sample class for Circle
 * @author Robby1
 *
 */
public class Circle2 {
	/** The radius of the circle */
	double radius;
	
	/** The number of objects created */
	static int numberOfObjects = 0;
	
	/** Construct a circle with radius 1 */
	Circle2(){
		radius = 1.0;
		numberOfObjects++;
	}
	
	/** Construct a circle with a specified radius */
	Circle2(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	/** Return numberOfObjects */
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea(){
		return radius * radius * Math.PI;
	}
}
