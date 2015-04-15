package Tutor;
/** 
 *  This program test Loan class's non-value contruction method
 * @author tangmi
 *
 */
import java.util.Scanner;
public class TestLoanClass2 {
	/** Main method */
	public static void main(String[] args){
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter yearly interest rate
		System.out.print(
				"Enter yearly interest rate , for example, 8.25: ");
		double annualInterestRate = input.nextDouble();
		
		//Enter number of years 
		System.out.print(
				"Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();
		
		// Enter loan amount
		System.out.print(
				"Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();
		
		// Create a loan object
		Loan loan = new Loan();
		
		// Display the default value 
		System.out.printf("The original annual interest rate is: %.2f\n" 
				+ "and the original loan amount is %.2f\n"
				+ " and the original number of Years for loan is %d\n", 
				loan.getAnnualInterestRate(),loan.getLoanAmount(),loan.getNumberOfYears());
		
		//Display loan date, monthly payment, and total Payment
		System.out.printf("The loan was created on %s\n" +
				"The monthly payment is %.2f\nThe total payment is %.2f\n",
				loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());
		
		// set the new parameters into Loan class
		loan.setAnnualInterestRate(annualInterestRate);
		loan.setLoanAmount(loanAmount);
		loan.setNumberOfYears(numberOfYears);

		System.out.printf("After the modification actions, the annual interest rate is: %.2f\n" 
				+ "and the loan amount is %.2f\n"
				+ " and the number of Years for loan is %d\n", 
				loan.getAnnualInterestRate(),loan.getLoanAmount(),loan.getNumberOfYears());		

		//Display loan date, monthly payment, and total Payment
		System.out.printf("The loan was created on %s\n" +
				"The monthly payment is %.2f\nThe total payment is %.2f\n",
				loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}
}
