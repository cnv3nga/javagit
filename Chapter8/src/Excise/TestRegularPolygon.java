package Excise;
/** 
 * This program test the Regular Polygon class
 * @author Robby1
 *
 */
public class TestRegularPolygon {
	/** main method */
	public static void main(String[] args){
		// Create 3 Regular polygons 
		RegularPolygon rPolygon1 = new RegularPolygon();
		RegularPolygon rPolygon2 = new RegularPolygon(6,4);
		RegularPolygon rPolygon3 = new RegularPolygon(10,4,5.6,7.8);
		
		rPolygon1.setSide(3);
		
		// display the perimeter and area for the 3 polygons
		System.out.println("The first polygon\'s perimeter is " + rPolygon1.getPerimeter()
				+ " and the area is " + rPolygon1.getArea());
		System.out.println("The second polygon\'s perimeter is " + rPolygon2.getPerimeter()
				+ " and the area is " + rPolygon2.getArea());
		System.out.println("The third polygon\'s perimeter is " + rPolygon3.getPerimeter()
				+ " and the area is " + rPolygon3.getArea());
	}

}
