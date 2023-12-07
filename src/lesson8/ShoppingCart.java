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
      myShirt.display();
    }
}

class Shirt {

    public String desc = "-description required-";
    public char colourCode;
    public double price;
    
    public void display() {
        System.out.println("Item description: " + desc);
        System.out.println("Colour Code: " + colourCode);
        System.out.println("Item Price: R" + price);
    }
}
