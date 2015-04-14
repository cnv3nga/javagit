package Excise;
/** this program to calculate the current DOT with currentTimeMillis 
 * 
 * @author Robby1
 */
public class CurrentDOT {
	/** main Method */
	public static void main(String[] args) {
		
	printCurrentDayAndTime();	
	}
	
	/** Print the current Day & time */
	public static void printCurrentDayAndTime(){
	
		// initilize the realTime value with the current millis time
		long realTime = System.currentTimeMillis();
		
		// remove the millis part of real time
		realTime = realTime / 1000;
		
		// Calculate the second value
		int secondTime = (int)realTime % 60;
		realTime = realTime / 60;
		
		// Calculate the minute value
		int minuteTime = (int)realTime % 60;
		realTime = realTime / 60;
		
		// Calculate the hour value
		int hourTime = (int)realTime % 24;
		realTime = realTime / 24;
		
		// Calculate the day value
		int totalDay = (int)realTime;
		
		// Calculate the current year
		int year = currentYear(totalDay);
		
		// Calculate the remain days
		int remainDays = totalDay - totalDaystoYear(year,1970) + 1;
			
		// Calculate the current month
		int month = currentMonth(remainDays, year);
		
		// Calculate the current day
		int day = currentDay(remainDays,month,year);
		
		// Final DOT value 
		String dotValue = "Current Date and time is " + monthName(month) + " " + day + ", "
			+ year + " " + hourTime + ":" + minuteTime + ":" + secondTime;
		
 		System.out.println(dotValue);
	}
	
	/** get the month name from the month value input */
	public static String monthName(int month){
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
	
	/** calculate the current year */
	public static int currentYear(int days){
		int targetYear = 1970;
		while (days > 0)  {
			targetYear ++;
			days -= totalDaystoYear(targetYear,targetYear-1);
		}
		return targetYear - 1 ;	
	}
	
	/** calculate the current month */
	public static int currentMonth(int days, int year){
		int targetMon = 0;
		while (days > 0) {
			targetMon++;
			days -= getNumberOfDaysInMonth(targetMon,year);
		}
		return targetMon;
	}
	
	public static int currentDay(int remainDays,int month,int year){
		int sumOfDays = 0;
		for (int i = 1; i < month; i++)
			sumOfDays += getNumberOfDaysInMonth(i,year);
		
		return remainDays - sumOfDays;
	}
	
	/** get the total days from since year 1st Jan to specific year */
	public static int totalDaystoYear(int targetYear, int sinceYear){
		int sumDays = 0;
		for (int i = sinceYear; i < targetYear; i++) {
			if (isLeapYear(i)) sumDays += 366;
			else sumDays += 365;
		}
		return sumDays;
	}
	
	
	/** get the number of days in specific month */
	public static int getNumberOfDaysInMonth(int month, int year) {
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

