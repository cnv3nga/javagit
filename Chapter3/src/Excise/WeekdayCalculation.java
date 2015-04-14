package Excise;
/**
 * This program calculate which day is in week
 * @author Robby1
 */
import java.util.Scanner;
public class WeekdayCalculation {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  // Prompt to user to enter the year
	  System.out.print("Enter year: ( e.g., 2008) ");
	  int year = input.nextInt();

	  // Prompt to user to enter the month
	  System.out.print("Enter month: 1-12 : ");
	  int month = input.nextInt();

	  // Prompt to user to enter the day of the month
	  System.out.print("Enter the day of the month: 1-31 : ");
	  int dayOfMonth = input.nextInt();
	  
	  // Calculate m value 
	  switch (month) {
	     case 1 : month = 13;
	              year--;         
	              break;
	     case 2 : month = 14;
	              year--;
	              break;
	     default : break;
	  }

	  // Calculate the century j value & year in century k value
	  int century = year / 100;
	  int yearInCentury = year % 100;
		
	  // Init the variables with simple name in the formula
	  int q = dayOfMonth;
	  int m = month;
	  int j = century;
	  int k = yearInCentury;
	  String dayOfWeek = "";
	  
	  // Calculate the day of week
	  int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
	  switch (h) {
	  case 0 : dayOfWeek = "saturday";
	           break;
	  case 1 : dayOfWeek = "sunday";
               break;
	  case 2 : dayOfWeek = "monday";
               break;
	  case 3 : dayOfWeek = "tuesday";
               break;
	  case 4 : dayOfWeek = "wednesday";
               break;
	  case 5 : dayOfWeek = "thursday";
               break;
	  case 6 : dayOfWeek = "friday";
               break;
	  default : System.out.println("The value of day is not in 0-6, please check");
               break;      
	  }
	  
	  System.out.println("Day of the week is " + dayOfWeek);
		  
		  
  }
}
