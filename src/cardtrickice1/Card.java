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
 * @modifier author derrick la ID: 9915727225
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
   
    
    //method for suits
    public String generateSuit(){
        double suitNum = (Math.random() * 4);
        return SUITS[(int)Math.floor(suitNum)];    
    }
    //method for numbers
    public int generateCardNum(){
        double cardNum = (1+ Math.random() * 13);
        return (int)cardNum;
    }
    
}
