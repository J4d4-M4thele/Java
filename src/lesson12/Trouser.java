/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Jada
 */
public class Trouser extends Clothing {
    private char fit;
    private char gender;
    
    public Trouser(int itemID, String desc, char colourCode, double price, char fit, char gender) {
    super(itemID, desc, colourCode, price);
    this.fit = fit;
    this.gender = gender;
    }
    
    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
