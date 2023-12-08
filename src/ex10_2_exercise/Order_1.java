
package ex10_2_exercise;

public class Order_1 {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order_1(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    // Code the calcDiscount method.
    public void calcDiscount() {
         if (custType == NONPROFIT) {
            if (total > 900) {
                discount = total * 0.1;
            } else {
                discount = total * 0.05;
            }

        } else if (custType == PRIVATE) {
            if (total > 900) {
                discount = total * 0.07;
            } else {
                discount = 0;
            }
        } else if (custType == CORP) {
            if (total < 500) {
                discount = total * 0.08;
            } else {
                discount = total * 0.05;
            }
        }
    }
}
