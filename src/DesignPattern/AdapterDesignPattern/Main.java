package src.DesignPattern.AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Started !!!!");
//        AppleCharger charger = new ChargerXYZ(); // lets say we don't have apple charger

        AppleCharger charger = new AdapterCharger(new ChargeAndrooidXYZ());

        Iphone iphone = new Iphone(charger);
        iphone.chargeIphone();
    }
}
