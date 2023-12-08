/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_1_exercise;

/**
 *
 * @author Jada
 */
public class TestClass {
    public static void main(String[] args) {
        int x = 6, y = 36, z;
        //36/6 = 6
        if((y/x) < 3) {
        x += y;
        }else {
            //its false so we multiply 6 by 36 = 216
        x *= y;
        }
        System.out.println("After if statement x is " + x);
        
        x = (y/x) < 3 ? (x += y) : (x *= y);
        System.out.println("After ternary operator x is " + x);
        
    }
}
//Exercise 10-1
//
//In the TestClass:
//1. Use a ternary operator to perform the same logic as
//     shown in the if | else construct.  
//2. Print the result of the ternary operator.
//     (Keep in mind, that the if statement changes the value
//     of x, so the output of the second print statement will
//     be different than the first.)