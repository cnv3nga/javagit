/** 
 * this program compute the area with console input.
 * @author Robby1
 */
import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
  public static void main(String[] args){
	  //Declare a constant
	  final double PI = 3.14159;
	  
	  // Create a Scanner object
	  Scanner input = new Scanner(System.in);
  
      // Prompt the user to enter a radius
	  System.out.print("Enter a number for radius: ");
	  double radius = input.nextDouble();
	  
	  // Compute area
	  double area = radius * radius * PI;
	  
	  //Display result
	  System.out.println("The area for the circle of radius " +
			  radius + " is " + area);
	   
  }
}
