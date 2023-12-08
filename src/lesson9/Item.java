/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Jada
 */
public class Item {
   private double price = 15.50;

    public void setPrice(Customer cust) {
        if (cust.hasLoyaltyDiscount()) {
            price = price * 0.85;
            System.out.println("Price with Discount: R" + price);
        }else System.out.println("Price is: R" + price);
    } 
}
