/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 * @modifier author derrick la
 * @modifier version 1.0
 * 
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
        
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
    
    //method for suits
    public String generateSuit(){
    double suitNum = ( Math.random() * 4);
 
    return SUITS[(int)Math.floor(suitNum)];    
    }
    
    public int generateCardNum(){
        //cardRabdinUpper is used to reduce the chances of consective repeating numbers
    double cardRandomUpper = (int)(1 + Math.random() * 13);
    double cardNum = (1 + Math.random() * cardRandomUpper);
    return (int)cardNum;
    
    }
    
}
