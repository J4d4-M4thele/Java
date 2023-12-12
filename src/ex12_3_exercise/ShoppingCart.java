package ex12_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // declare and instantiate a Shirt object using an Item reference type
        //Item newShirt = new Shirt(19.99, 'M', 'B');
        Item newShirt = new Item();
        
        // call the display method on the object, then the getColor method
        newShirt.display();
        if(newShirt instanceof Shirt) {
        String colorCode = ((Shirt)newShirt).getColor();
            System.out.println("\tColour : " + colorCode);
        }else{
            System.out.println("Not an instance of Shirt");
        }
    }
}
//In the ShoppingCart class:
//3.  Declare and instantiate a Shirt object using an Item reference type.
//      Call the 3-arg constructor to assign values.
//4.  Call the display method of the object.
//5.  Use instanceof to confirm that the object is, indeed, a Shirt.
//6.  If it is a Shirt, 
//      - cast the object to a Shirt and call the getColor method, assigning 
//        the return value to a String variable.
//      - Print out the color name using a suitable label.
//7.  If it is not a Shirt, print a message to that effect.
//8.  Test your code.  You can test the non-Shirt object condition
//      by instantiating an Item object instead of a Shirt object.
