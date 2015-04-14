package tutor;
/**
 * Sample program to excise the subtraction 
 * @author Robby1
 *
 */
import javax.swing.JOptionPane;

public class SubtractionQuiz {
  public static void main(String[] args) {
	  // 1. Generate two random integer number
	  int number1 = (int)(Math.random()*10);
	  int number2 = (int)(Math.random()*10);
	  
	  // 2. If number1 < number2, swap number1 with number2
	  if (number1 < number2) {
		  int temp = number1;
		  number1 = number2;
		  number2 = temp;
	  }
	  
	  // 3. Prompt the student to answer "what is number1 -number2?"
	  String answerString = JOptionPane.showInputDialog("What is " + number1 + " - " + number2 + " ? ");
	  
	  // 4. Convert String to integer
	  int answer = Integer.parseInt(answerString);
	  
	  // 5. Grade the answer and display the result 
	  String output = "";
	  if (answer == number1 - number2) 
		  output = "You are correct ! ";		  
	  else 
		  output = "Your answer is wrong\n" + number1 + " - " + number2 + " should be " + (number1 - number2);
	  JOptionPane.showMessageDialog(null, output);
	  
  }
}
