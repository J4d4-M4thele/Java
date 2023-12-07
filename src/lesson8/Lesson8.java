/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author Jada
 */
public class Lesson8 {

    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        double den = 2.0;
//
//        calc.calculate(3, den);
//        calc.printString();
//        System.out.println(calc.sum(4, 6));
//        System.out.println(calc.isGreater(20, 5));

//        int num1 = 1, num2 = 2;
//        int result = num1 + num2;
//        System.out.println(result);

        int num1 = 1, num2 = 2;
        int result = sum(num1, num2);
        System.out.println(result);
    }
    //static keyword allows us to access method without creating an instance of object
    //w/o static we'll need to create an instance
    //used when objects have shared values
    public static int sum(int x, int y) {
        return (x + y);
    }

}

class Calculator {

    public void calculate(int x, double y) {
        System.out.println(x / y);
    }

    public void printString() {
        System.out.println("Hello");
    }

    public int sum(int x, int y) {
        return (x + y);
    }

    public boolean isGreater(int x, int y) {
        return (x > y);
    }
}
