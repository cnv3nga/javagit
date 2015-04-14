package Excise;
/**
 * This program simulates to pick a card randomly
 * @author Robby1
 */

public class PickCard {
   public static void main(String[] args) { 
	// Generate one from 13 number of cards
	   int x = (int)(Math.random() * 13) + 1;
	   int y = (int)(Math.random() * 4) + 1;
	
	// initiate and assign the cards number & color
	   String cardNumber,cardColor = "";
	   
	   switch (x) {
	   case 1 : cardNumber = "Ace";
	            break;
	   case 11 : cardNumber = "Jack";
	            break;
	   case 12 : cardNumber = "Queen";
                break;
	   case 13 : cardNumber = "King";
	   			break;
	   default : cardNumber = "" + x;
	   			break;
	   }
	
	   switch (y) {
	   case 1 : cardColor = "Clubs";
	            break;
	   case 2 : cardColor = "Diamond";
	   			break;
	   case 3 : cardColor = "Heart";
	   			break;
	   case 4 : cardColor = "Spades";
	   			break;
	   default : System.out.println("Wrong card color value be assigned.");
	   			break;   			
	   }
	
	// Display the radom cards picked   
	   System.out.println("The card you picked is " + cardNumber + " of " + cardColor);
   }
}
