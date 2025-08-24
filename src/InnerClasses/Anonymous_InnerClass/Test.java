package src.InnerClasses.Anonymous_InnerClass;

public class Test {
    public static void main(String[] args) {
        ShoppringCart shoppringCart = new ShoppringCart(150);

        shoppringCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println(" Paid "+amount+" Using Credit Card");
            }
        });

        shoppringCart.processPayment(amount -> System.out.println(" Paid "+amount+" Using ATM Card") );

    }
}
