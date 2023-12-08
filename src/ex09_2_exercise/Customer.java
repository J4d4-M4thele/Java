/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex09_2_exercise;

/**
 *
 * @author Jada
 */
public class Customer {
    private String name;
    private String ssn;
    
    public void Customer(String name, String ssn) {
    this.name = name;
    this.ssn = ssn;
    }

    public String getName () {
    return name;
    } 
    
    public void setName (String name) {
    this.name = name;
    }
    
    public String getSSN () {
    return ssn;
    } 
}
//Exercise 9-2
//
//In the Customer class:
//1. Add a custom constructor that initializes the fields.