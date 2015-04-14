/**
 * Excise 2.5, writing program to calculate the sum of all digits number. 
 * @author Robby1
 *
 */
import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  // parse the input number 
	  System.out.print("Enter a number between 0 and 1000 :");
	  int number = input.nextInt();
	  
	  // get the third digit value
	  int thirdDigit = number / 100;
	  int remainValue = number % 100;
	  
	  // get the second & fisrt digit value
	  int secondDigit = remainValue / 10;
	  int firstDigit = remainValue % 10;
	  
	  // sum the all digits value
	  int digitNumber = firstDigit + secondDigit + thirdDigit;
	  
	  //print the value 
	  System.out.println("The sum of the digits is " + digitNumber);
	 
  }
}
