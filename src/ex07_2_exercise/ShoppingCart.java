/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex07_2_exercise;

/**
 *
 * @author Jada
 */
public class ShoppingCart {
    public static void main(String[] args) {
//        StringBuilder firstName = new StringBuilder("Jada");
//        firstName.append(" Mathele");
//        System.out.println(firstName);
        
        StringBuilder firstName = new StringBuilder("Jada");
        String lastName = " Mathele";
        firstName.append(lastName);
        System.out.println(firstName);
    }
}
//Exercise 7-2
//
//1. Instantiate the StringBuilder object (sb), initializing it
//     to firstName, using the StringBuilder constructor.
//2. Use the append method of the StringBuilder object to append the 
//     last name back onto the first name.  You can just use a String 
//     literal for the last name.  
//     Print the StringBuilder object and test your code.  
//     It should show the full name.
//
//Challenge:  Can you append the last name without using a String literal?