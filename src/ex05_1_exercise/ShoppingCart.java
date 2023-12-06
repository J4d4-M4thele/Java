/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_1_exercise;

/**
 *
 * @author Jada
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Jada";
        String itemDesc = "Bar One Chocolate";
        
        boolean outOfStock = false;
        double price = 9.99, tax = 0.15, total;
        int quantity = 1;
        
        total = (price + tax) * quantity;
        String message;
        
        if(quantity > 1) {
         message = custName + " wants to purchase " + quantity + " " + itemDesc
        + "s. Total cost with tax is: R" + total + ".";
        }else {
        message = custName + " wants to purchase " + quantity + " " + itemDesc
        + " . Total cost with tax is: R" + total + ".";
        }
        
        if(outOfStock == true) {
        message = "Sorry but this item is out of stock";
        }
        
        
        System.out.println(message);
        
        
    }
}
//Exercise 5-1:
//
//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.