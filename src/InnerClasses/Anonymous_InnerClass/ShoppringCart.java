package src.InnerClasses.Anonymous_InnerClass;

public class ShoppringCart {
    double totalAmount;
    public ShoppringCart(double totalAmount){
        this.totalAmount =totalAmount;
    }
    public void processPayment(Payment paymentMethod){
            paymentMethod.pay(totalAmount);
    }
}
