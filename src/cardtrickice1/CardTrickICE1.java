/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan
 * @modifier derrick la 
 * @modifier version 1.0
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the card's suit: ");
        String userSuit = userInput.next();
        int userCard;
        System.out.println("Please enter the card number form 1 to 13:");
        userCard = userInput.nextInt();
        
        System.out.println(userSuit +" card number: " + userCard);
   //     Card[] magicHand = new Card[7]; //Array of object
      //  for( int i=0;i<magicHand.length;i++)
       // {
      //      Card c1 = new Card();
      //      c1.setValue(2);//use a method to generate random *13
      //      c1.setSuits("hearts");//random method suit 
      //  }
        //step 2:take input 
        
        //step 3: match with array 
    }
    
}
