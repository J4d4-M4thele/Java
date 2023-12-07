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
public class Item {

    public String descr;
    public int quantity;
    public double price;
    public char colour = 'U';

    public void displayItem() {
        System.out.println("Item: " + descr);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Colour: " + colour);

    }

    //3-arg setItemFields
    public void setItemFields(String descr, int quantity, double price) {
        this.descr = descr;
        this.quantity = quantity;
        this.price = price;
    }

    //4-arg setItemFields
    //overloaded setItemFields method
    public int setItemFields(String descr, int quantity, double price, char col) {
        if (col != ' ') {
            colour = col;
            setItemFields(descr, quantity, price);
            return 1;
        } else {
            return -1;
        }
    }
}
//In the Item class:
//1. Write a setItemFields method that takes 3 args and assigns them 
//     to desc, quantity, and price fields.  The method returns void. 
//2. Write an overloaded setItemFields method that takes 4 args and 
//     returns an int.  The method assigns all 4 fields.  Invalid value for 
//     the colorCode arg is ' ' (a single space)
//   If the colorCode arg is invalid, return -1 without assigning the value.
//   If the colorCode is valid, assign the colorCode field and then assign 
//     the remaining fields by calling the 3 arg method.
