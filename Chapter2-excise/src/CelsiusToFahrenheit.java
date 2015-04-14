/**
 * Excise 2.1, writing program to transfer Celsius To Fahrenheit. 
 * @author Robby1
 *
 */
import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// Enter the input from console
	System.out.print("Enter a degree in Celsius ");
	int celsiusDegree = input.nextInt();
	
	//Calculate the Fahrenheit number
	double fahrenheitDegree = (9.0/5) * celsiusDegree + 32;
	
	// print the Fahrenheit Degree 
	System.out.println(celsiusDegree + " Celsius is " + fahrenheitDegree + " Fahrenheit");
  }
}
