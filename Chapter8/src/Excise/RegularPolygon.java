package Excise;
/**
 * This program define a standard regular polygon class
 * @author Robby1
 *
 */
public class RegularPolygon {
	// define a private variable to indicate the number of sides
	private int n = 3;
	// define a private variable to assign the length of side
	private double side = 1.0;
	// define the private variables for the center pointer's coordinate
	private double x = 0;
	private double y = 0;
	
	// Construct method 
	public RegularPolygon(){
		n = 3;
		side = 1.0;
		x = 0;
		y = 0;

	}

	public RegularPolygon(int newN, double newSide ){
		n = newN;
		side = newSide;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int newN, double newSide, double newX, double newY){
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}

	// Return n;
	public int getN(){
		return n;
	}
	
	// Return side;
	public double getSide(){
		return side;
	}
	
	//Return x;
	public double getX(){
		return x;
	}
	//Return y;
	public double getY(){
		return y;
	}
	
	// Modify n;
	public void setN(int newN){
		n = newN;
	}
	
	// Modify side;
	public void setSide(double newSide){
		side = newSide;
	}
	
	// Modify x;
	public void setX(double newX){
		x = newX;
	}
	
	// Modify y;
	public void setY(double newY){
		y = newY;
	}
	
	// return perimeter
	public double getPerimeter(){
		return n * side;
	}
	
	// return the area of polygon
	public double getArea(){
		return n * side * side / (4 * Math.tan(Math.PI / n));
	}
}

