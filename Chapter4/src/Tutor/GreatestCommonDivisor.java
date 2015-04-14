package Tutor;
/**
 * This program calculate the greatest common divisor
 * @author Robby1
 */
import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		// declare the Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the input n1 & n2 to user
		System.out.print("Enter the 2 numbers for greatest common divisor calculation : ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		// Calculate the greatest common divisor
		int gcd = 1;
		
		for (int k = 2; k <= n1 && k <= n2; k++){
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
	
	// Print the GCD value 
	    System.out.println("The greatest common divisor for " + n1 + " and " + 
	    		   n2 + " is " + gcd);
	    
	}

}
