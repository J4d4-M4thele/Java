/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_2_exercise;

import ex08_1_exercise.*;

/**
 *
 * @author Jada
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setItemFields("Anime Tee", 1, 9.99);
        item1.displayItem();
        Item item2 = new Item();
        int val = item2.setItemFields("Purse", 2, 54.99 , ' ');
        if(val < 0) {
            System.out.println("Invalid Colour Code!");
        }else {
        item1.displayItem();
        }  
    }
}
//In the ShoppingCart class:
//3. Call the 3-arg setItemFields method and then call item1.displayItem()
//4. Call the 4-arg setItemFields method, checking the return value.  
//     If the return value < 0, print an invalid color code message,
//     otherwise call displayItem.