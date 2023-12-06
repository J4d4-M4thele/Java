/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_2_exercise;

/**
 *
 * @author Jada
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Jada";
        String[] item = new String[4];
        item[0] = "Bar One Chocolate";
        item[1] = "Top Deck Chocolate";
        item[2] = "LunchBar Chocolate";
        item[3] = "Five Star Chocolate";
                
        //stock and pricing
        boolean outOfStock = false;
        double price = 9.99, tax = 0.15, total;
        int quantity = item.length;
        
        total = (price + tax) * quantity;
        //messages
        String message;
         message = custName + " wants to purchase " + quantity + " items. The third item is " + item[2];
         
        if(outOfStock == true) {
        message = "Sorry but this item is out of stock";
        }

        System.out.println(message);
 
    }
}
//Exercise 5-2
//
//1. Declare a String array and initialize it with 4 elements.
//     Each element represents a different item description ("Shirt", for instance).
//2. Change message to show how many items the customer wants to purchase 
//     (Use the length property of the items array).
//3. Print just one element of the items array.  
//     What happens if you use index number 4?