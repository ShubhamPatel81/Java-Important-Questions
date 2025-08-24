package src.InnerClasses.Anonymous_InnerClass;

public class CreditCartV0 implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println(" Paid "+amount+" Using Credit Card");
    }
}
