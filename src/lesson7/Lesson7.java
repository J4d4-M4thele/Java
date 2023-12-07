/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson7;

/**
 *
 * @author Jada
 */
public class Lesson7 {

    public static void main(String[] args) {
//        String hello = "Hello World!!!!";
//        int stringLength = hello.length();
//        int hello2 = "Hi! How are you doing?".length();
//        System.out.println(stringLength);
//        System.out.println(hello2);

        //trim() removes whitespace
//        String greet = " HOW ".trim();
//        String lc = (greet + "DY").toLowerCase();
//        System.out.println(lc);
//        String phoneNum = "404-543-2345";
//        int idx1 = phoneNum.indexOf("-");
//        System.out.println("Index of first dash: " + idx1);
//        
//        int idx2 = phoneNum.indexOf("-", idx1 + 1);
//        System.out.println("Index of second dash: " + idx2);
        StringBuilder mySB = new StringBuilder("Hello");
        mySB.append(" World");

        System.out.println(mySB);
    }
}
