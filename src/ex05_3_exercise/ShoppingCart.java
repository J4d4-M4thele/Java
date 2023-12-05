/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_3_exercise;

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
        String message = "Items purchased: ";
        //
        if(outOfStock == true) {
        message = "Sorry but this item is out of stock";
        }
        System.out.println(message);
        //message
        for(String items: item) {
        System.out.println(items);
        }
    }
}
//Exercise 5-3
//
//1. Create a for loop that iterates through the items array,
//     displaying each element. Precede the list of elements with 
//     the message, "Items purchased: ".
