/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author Jada
 */
public class Lesson6 {

//    public static void main(String[] args) {
//        //data type is of class type(in this case customer)
//        //created instances of customer class
//        Customer cust01 = new Customer();
//        Customer cust02 = new Customer();
//        
//        //accessing fields
//        cust01.age = 40;
//        cust02.name = "Duke";
//        
//        //calling methods
//        cust01.displayCustomer();
//        cust02.displayCustomer();
//    }
    public static void main(String[] args) {
        //declaring reference and instanciating
        Customer cust01 = new Customer();
        //declaring first
        Customer cust02;
        //then instanciating
        cust02 = new Customer();

        //accessing fields
        cust01.age = 40;
        cust02.name = "Duke";

        //calling methods
        cust01.displayCustomer();
        cust02.displayCustomer();
        
        System.out.println(cust01);
        System.out.println(cust02);
        cust02.cart.cancel();
    }
}

//blueprint of an object
class Customer {
    public Cart cart = new Cart();
    public String name;
    public int age;

    public void displayCustomer() {
        System.out.println("Customer's name: " + name + ". Customer's age: " + age);
    }
}

class Cart {
 public Item[] items;
 
 public void cancel() {
     System.out.println("Cancelling cart...");
 }
}

class Item {

}