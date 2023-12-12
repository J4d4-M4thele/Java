/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Jada
 */
public class TestInheritence {
    public static void main(String[] args) {
        //reference is superclass
        Clothing shirt01 = new Shirt(1, "hoodie", 'R', 99.90, 'L');
        Clothing trouser01 = new Trouser(2, "slacks", 'T', 199.90, 'M', 'F');
        shirt01.display();
        System.out.println();
        trouser01.getItemID();
        trouser01.display();
        //must cast as trouser because it's a clothing instance
//        ((Trouser)trouser01).getFit();
//        if(trouser01 instanceof Trouser) {
//        char fitcode = ((Trouser)trouser01).getFit();
//            System.out.println("Fit: " + fitcode);
//        }
    }
 
}
