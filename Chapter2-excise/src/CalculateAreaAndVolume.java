/**
 * Excise 2.2, writing program to Calculate Area and Volume. 
 * @author Robby1
 *
 */
import java.util.Scanner;

public class CalculateAreaAndVolume {
	  public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			// Declare the constant value for PI
			final double PI = 3.14159;
			
			// Enter the input for radius and length
			System.out.print("Enter the radius and length of the cylinder : ");
			double radius = input.nextDouble();
			double length = input.nextDouble();
			
			// Calculate the area of the cylinder
			double area = PI * Math.pow(radius, 2);
			// keep 4 digits of area
			// area = (int)(area * 10000) / 10000.0;
			
			// Calculate the volume of the cylinder
			double volume = area * length;
			// keep 1 digits of volume
			// volume = (int)(volume * 10) / 10.0; 
			
			// print the Fahrenheit Degree 
			System.out.println("The area is " + area);
			System.out.println("The volume is " + volume);
		  }  
}
