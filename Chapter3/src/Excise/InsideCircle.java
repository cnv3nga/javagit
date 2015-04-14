package Excise;
/**
 * This program judge if the point is in the circle
 * @author Robby1
 */

import java.util.Scanner;

public class InsideCircle {
   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   // Prompt for user to enter a point
	   System.out.print("Enter a point with two coordinates: ");
	   double x = input.nextDouble();
	   double y = input.nextDouble();
	   
	   // Calculate the distance from the point to the center of circle
	   double distance = Math.pow(Math.pow(x,2) + Math.pow(y, 2), 0.5);
	   
	   // Judge and tell if the point is in the circle
	   System.out.println((distance < 10) ? "Point (" + x + "," + y + ") is in the circle" : "Point (" + x + "," + y + ") is not in the circle" );
   }
}
