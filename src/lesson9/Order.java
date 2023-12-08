/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Jada
 */
public class Order {

    public static void main(String args[]) {
        Customer cust = new Customer(1);
        Item item = new Item();
        cust.setLoyaltyPoints(true);
        item.setPrice(cust);

    }
}
