/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan
 * @modifier derrick la ID: 9915727225
 * @modifier version 1.0
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
        
        Card[] magicHand = new Card[7];
        for(int i = 0; i < magicHand.length; i++){
            Card Cards = new Card();
            
            Cards.setSuits(Cards.generateSuit());
            Cards.setValue(Cards.generateCardNum());            
            magicHand[i] = Cards;                   
        }
         for(int i = 0; i< magicHand.length; i++){
            System.out.println(magicHand[i].getValue() +" " + magicHand[i].getSuits());     
        }
         
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the card's suit: ");
        String userSuit = userInput.next().toLowerCase();      
        System.out.println("Please enter the card number form 1 to 13:");
        int userCard = userInput.nextInt();
        boolean inHand = false;
        for(int i = 0; i< magicHand.length; i++){
           if(userCard == magicHand[i].getValue() && userSuit.equalsIgnoreCase(magicHand[i].getSuits())){
               inHand = true;
           }
            
        }
        if(true == inHand){
            System.out.println("Great! your card, "+ userCard + " of " + userSuit + " is in this hand.");
            
        }
        else{
            System.out.println("Sorry. Your card is not in this hand, better luck next time.");
        }
        
        
    
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
