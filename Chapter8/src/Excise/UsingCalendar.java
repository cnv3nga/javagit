package Excise;
/**
 * This program use calendar class to display specific year,month,day
 * @author Robby1
 *
 */
import java.util.GregorianCalendar;
public class UsingCalendar {
	/** Create Main method */
	public static void main(String[] args){
		// Create a calendar object for current day
		GregorianCalendar currentDay = new GregorianCalendar();
		
		// Create a calendar object for specific day
		GregorianCalendar specificDay = new GregorianCalendar();
		
		// Set the specific day
		specificDay.setTimeInMillis(1234567898765L);
		
		//Display the year,month & Day for current day
		System.out.println("Current year is " + currentDay.get(GregorianCalendar.YEAR) +
				" Current month is " + currentDay.get(GregorianCalendar.MONTH) +
				" Current Day is " + currentDay.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println("Specific year is " + specificDay.get(GregorianCalendar.YEAR) +
				" Specific month is " + specificDay.get(GregorianCalendar.MONTH) +
				" Specific Day is " + specificDay.get(GregorianCalendar.DAY_OF_MONTH));		
	}
	
}
