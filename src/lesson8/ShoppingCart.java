/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author Jada
 */
public class ShoppingCart {

    public static void main(String[] args) {
//        Shirt myShirt = new Shirt();
//        Shirt yourShirt = new Shirt("long sleeve", 'R', 99.90);
//        myShirt.display();
//        yourShirt.display();

        Shirt shirt01 = new Shirt("Sailor", "Blue", 30);
        Shirt shirt02 = new Shirt("Sweatshirt", "Green", 25);
        Shirt shirt03 = new Shirt("Skull", "Blue", 15);
        Shirt shirt04 = new Shirt("Tee", "Red", 50);
        
        shirt01.display();
        shirt02.display();
        shirt03.display();
        shirt04.display();
    }
}

class Shirt {

    //Fields
    public String desc;
    public char colourCode;
    public double price;

    //constructor(allows for values/params to be passed into fields)
    //instantiates fields
    public Shirt() {
        desc = "-description required-";
        colourCode = 'U';
        price = 0.0;
    }

    //allows us to pass values during main method instantiation
    public void setFields(String desc, double price) {
        this.desc = desc;
        this.price = price;
    }

    public void setColour(String theColour) {
        if (theColour.length() > 0) {
            colourCode = theColour.charAt(0);
        }
    }

    public Shirt(String desc, String colour, double price) {
        setFields(desc, price);
        setColour(colour);
    }
    public void display() {
        System.out.println("Item description: " + desc);
        System.out.println("Colour Code: " + colourCode);
        System.out.println("Item Price: R" + price);
    }
}
