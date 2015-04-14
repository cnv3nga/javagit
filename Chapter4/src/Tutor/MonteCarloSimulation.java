package Tutor;
/**
 * This program play with MonteCarlo Simulation
 * @author Robby1
 */
public class MonteCarloSimulation {
	public static void main(String[] args) {
		final int NUMBER_OF_TRIAL = 1000000;
		int numberOfHits = 0;
		
		for (int i = 1; i <= NUMBER_OF_TRIAL; i++) {
			// Generate the random point
			double x = Math.random() * 2 - 1;
			double y = Math.random() * 2 - 1;
			
			// Calculate the number of hits
			if (Math.pow(x,2) + Math.pow(y,2) <= 1) 
					numberOfHits++ ;
		}
	double pi = 4.0 * numberOfHits / NUMBER_OF_TRIAL;
	System.out.println("PI is " + pi);
	}
}
