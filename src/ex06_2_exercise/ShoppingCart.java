/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex06_2_exercise;

/**
 *
 * @author Jada
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Item item01 = new Item();
        Item item02 = new Item();

        item01.desc = "Bar One";
        item02.desc = "Top Deck";   
        
        System.out.println("Item descriptions: ");
        item01.displayItem();
        item02.displayItem();
    }
}

class Item {

    public int itemID;
    public String desc;
    public double price;
    public int quantity;
    
    public void displayItem() {
        System.out.println(desc);
    }
}

//Exercise 6-2
//
//In the ShoppingCart class:
//1. Declare and instantiate 2 objects of type Item. Initialize only 
//     the descr field in each, using different values for each.
//2. Print the description for each item and run the code.
//3. (Optional) Above the code that prints the descriptions, 
//     assign item2 to item1.  Run it again.
