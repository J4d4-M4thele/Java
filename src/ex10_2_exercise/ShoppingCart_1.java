
package ex10_2_exercise;

public class ShoppingCart_1 {
    public static void main(String args[]){
        Order_1 order = new Order_1("Rick Wilson", 910.00, "VA", Order_1.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
