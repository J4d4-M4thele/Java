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
//        StringBuilder mySB = new StringBuilder("Hello");
//        mySB.append(" World");
//
//        System.out.println(mySB);
//        int count = 15;
//        int a, b, c, d;
//        //poincrement
//        a = count++;
//        b = count;
//        //preincrement
//        c = ++count;
//        d = count;
//        
//        System.out.println(a + ", " + b + ", " + c + ", " + d);
//    short a, b, c;
//    a = 1;
//    b = 2;
//    c = (short) (a + b);
        Person person1 = new Person();
        person1.calcAge();
    }
}

class Person {

    int ageYears = 19;

    public void calcAge() {
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;

        System.out.println("You are " + ageDays + " days old!");
        System.out.println("You are " + ageSeconds + " seconds old!");
    }
}
