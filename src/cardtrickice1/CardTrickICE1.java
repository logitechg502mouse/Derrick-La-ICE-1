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
      
        //step 2:take input 
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the card's suit (hearts, spades, diamonds, clubs): ");
        String userSuit = userInput.next().toLowerCase();      
        System.out.println("Please enter the card number form 1 to 13:");
        int userCard = userInput.nextInt();
        
        Card luckyCard = new Card();
        luckyCard.setSuits("hearts");
        luckyCard.setValue(8);
        
        Card[] magicHand = new Card[7];
        for(int i = 0; i < magicHand.length; i++){
            Card Cards = new Card();
            
            Cards.setSuits(Cards.generateSuit());
            Cards.setValue(Cards.generateCardNum());            
            magicHand[i] = Cards;                   
        }
        
        
        System.out.println("\n------------Cards Generated------------");
        for(int i = 0; i< magicHand.length; i++){
            System.out.println(magicHand[i].getValue() +" of " + magicHand[i].getSuits());     
        }
         
        //step 3: match with array 
        boolean inHand = false;
        for(int i = 0; i< magicHand.length; i++){
           if(userCard == magicHand[i].getValue() && userSuit.equalsIgnoreCase(magicHand[i].getSuits())){
               inHand = true;
           }         
        }
        
        if(true == inHand){
            System.out.println("\nGreat! your card, "+ userCard + " of " + userSuit + ", is in this hand.");      
        }
        else{
            System.out.println("\nSorry. Your card is not in this hand, better luck next time.");
        }
        
     
        
        
    }         
}
