/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Jada
 */
public abstract class Clothing {

    private int itemID = 0;
    private String desc = "-description required-";
    private char colourCode = 'U';
    private double price = 0.0;

    public Clothing(int itemID, String desc, char colourCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colourCode = colourCode;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public char getColourCode() {
        return colourCode;
    }

    public void setColourCode(char colourCode) {
        this.colourCode = colourCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public abstract void display();
}
