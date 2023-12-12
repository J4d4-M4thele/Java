/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import lesson12.*;

/**
 *
 * @author Jada
 */
public class TestToString {

    public static void main(String[] args) {
        //reference is superclass
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');
        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F');

        System.out.println(shirt01);
        System.out.println();
        System.out.println(trouser01);
    }
}
