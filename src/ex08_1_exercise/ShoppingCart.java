/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex08_1_exercise;

/**
 *
 * @author Jada
 */
public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.colour = 'B';
        if(item1.setColour('B')) {
            System.out.println("Item colour is: " + item1.colour);
        }else {
            System.out.println("Invalid colour!");
        }
    }
}
//Exercise 8-1
//In the ShoppingCart class:
//2. Call the setColor method on item1.  If it returns true,
//     print out item1.color.  If it returns false, print an
//     invalid color message.
//3. Test the method with both a valid color and an invalid one.