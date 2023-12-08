/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex09_2_exercise;

/**
 *
 * @author Jada
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Customer cust01 = new Customer();
        cust01.Customer("Jada", "404-466-9241");
        System.out.println("Out first customer is " + cust01.getName() + "!");
    }
}
//In the ShoppingCart class:
//2. Declare, instantiate, and initialize a new Customer object
//    by calling the custom constructor.  
//3. Test it by printing the customer object name 
//    (call getName method).
