/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author Jada
 */
public class Employees {
    public static void main(String[] args) {
        String name1 = "Fred Smith";
        String name2 = "fred Smith";
        
        if(name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are the same.");
        }else {
        System.out.println("Names are different.");
        }
        
    }
}
