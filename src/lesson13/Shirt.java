/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author Jada
 */
public class Shirt extends Clothing {

    private char fit = 'U';

    public Shirt(int itemID, String desc, char colourCode, double price, char fit) {
        //links to superclass(always first line of subclass constructor!!!!)
        super(itemID, desc, colourCode, price);
        this.fit = fit;
    }

//    public Shirt(char fit) {
//    this(15.00, fit);
//    }
//    
//    public Shirt(double price, char fit) {
//    super(price);
//    this.fit = fit;
//    }
    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public void display() {
        System.out.println("ItemID: " + getItemID());
        System.out.println("Item Description: " + getDesc());
        System.out.println("Price: " + getPrice());
        System.out.println("Colour Code: " + getColourCode());
        System.out.println("Fit: " + fit);
    }
//    protected void setColourCode(char colourCode) {
//    super.setColourCode(colourCode);
//    }
    
    @Override
    public String toString() {
//    return ("\nItemID: " + getItemID() + "\nPrice: " + getPrice() + "\nColour Code: " + getColourCode() +
//            "\nFit: " + fit);
    return ("This shirt is size " + fit + " that costs R" + getPrice() +".");
    }
}
