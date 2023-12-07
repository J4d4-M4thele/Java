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
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt("long sleeve",'R',99.90);
        myShirt.display();
        yourShirt.display();
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
    public Shirt(String desc, char colourCode, double price) {
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    public void display() {
        System.out.println("Item description: " + desc);
        System.out.println("Colour Code: " + colourCode);
        System.out.println("Item Price: R" + price);
    }
}
