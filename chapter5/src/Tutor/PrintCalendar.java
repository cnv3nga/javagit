package Tutor;
/**
 * This program print calendar for specific year & month
 * @author Robby1
 */
import java.util.Scanner;

public class PrintCalendar {
	/** Main method  */
	public static void main(String[] args){
		// Declare the input object
		Scanner input = new Scanner(System.in);
		
		// prompt to user for the input year & month
		System.out.print("Enter full year (e.g., 2010) : " );
		int year = input.nextInt();
		
		System.out.print("Enter month in number between 1 and 12: " );
		int month = input.nextInt();
		
		// Print canlendar for the month of year
		printMonth(year,month);
	}

	/** Print calendar for the month of the year  */
	public static void printMonth(int year, int month) {
		// Print the heading of calendar
		printMonthTitle(year,month);
		
		// Print the body of the calendar
		printMonthBody(year,month);
	}
	
	/** Print the month title, e.g., May, 1999 */
	public static void printMonthTitle(int year, int month) {
		System.out.println("          " + getMonthName(month) + " " + year);
		
		System.out.println("-------------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		
	}

	/** Print the body of the calendar */
	public static void printMonthBody(int year, int month) {
		// get the start day's value 
		int startDay = getStartDay(year,month);
		int totalDay = getNumberOfDaysInMonth(year,month);
		
		// locate the position of the first day in this month
		for (int i = 0; i < startDay; i++)
			System.out.print("    ");
		
		for (int i = 1; i <= totalDay; i++){
			if ((i + startDay) % 7 == 0)
				System.out.printf("%4d%c", i,'\n');
			else
				System.out.printf("%4d",i);
		}
	}

	/** get the name of the specific month */
	public static String getMonthName(int month){
		String monthName = "";
		switch (month) {
		case 1 : monthName = "January"; break;
		case 2 : monthName = "February"; break;
		case 3 : monthName = "March"; break;
		case 4 : monthName = "April"; break;
		case 5 : monthName = "May"; break;
		case 6 : monthName = "June"; break;		
		case 7 : monthName = "July"; break;
		case 8 : monthName = "August"; break;
		case 9 : monthName = "September"; break;		
		case 10 : monthName = "Octorber"; break;
		case 11 : monthName = "November"; break;
		case 12 : monthName = "December"; break;		
		default : return "wrong value"; 
		}
		return monthName;
	}

	/** get the start day of the specific month */
	public static int getStartDay(int year, int month) {
		// initialize the start day of week is wednesday as 1800 1st Jan
		int startday = 3;
		
		startday = (startday + getTotalNumberOfDays(year,month)) % 7;
		return startday;
	}

	/** get the total number of days from the specific month to 1800 */
	public static int getTotalNumberOfDays(int year, int month) {
		int sumOfDays = 0;
		
		// Calculate the total days from 1800 to the begining of the specific year
		for (int i = 1800; i < year; i++) {
			if (isLeapYear(i)) sumOfDays += 366;
			else sumOfDays += 365;
		}
		
		// Add the days in the specific year to the sum days 
		for (int i = 1; i < month; i++) {
			sumOfDays += getNumberOfDaysInMonth(year, i);
		}
			
		return sumOfDays;
	}

	/** get the number of days in specific month */
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
			return 31;
		
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		
		if (month == 2)
			return (isLeapYear(year) ? 29 : 28) ;
		
		return 0;
	}

	/** judge if the specific year is leap year */
	public static boolean isLeapYear(int year) {
		// judge the leap year
		boolean result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
		return result;
	}
}




