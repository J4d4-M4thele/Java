/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex09_1_exercise;

/**
 *
 * @author Jada
 */
public class Customer {
    private String name;
    private String ssn;

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
//Exercise 9-1
//
//1. Encapsulate this class.  Change access modifiers so that fields can
//     be read or changed on through public methods.  
//     The ssn field should be READ ONLY.