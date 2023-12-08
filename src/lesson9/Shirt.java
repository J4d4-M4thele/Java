/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Jada
 */
public class Shirt {
    private int shirtID = 0;
    private String descr = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;
    
    public char getColourCode() {
    return colourCode;
    } 
    
    public void setColourCode(char newCode) {
    if(newCode == 'R') {
    colourCode = newCode;
    return;
    }
    if(newCode == 'G') {
    colourCode = newCode;
    return;
    }
    if(newCode == 'B') {
    colourCode = newCode;
    return;
    }
        System.out.println("Invalid colourCode. Use R, G or B");
    }
    
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt();
        shirt01.getColourCode();
        System.out.println("Get Colour: " + shirt01.colourCode);
        shirt01.setColourCode('T');
        System.out.println("Set Colour: " + shirt01.colourCode);
    }
}
