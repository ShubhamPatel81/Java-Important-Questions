package src.DesignPattern.AdapterDesignPattern;

public class AdapterCharger implements AppleCharger{

    private AndroidCharge androidCharge;

    public AdapterCharger(AndroidCharge androidCharge) {
        this.androidCharge = androidCharge;
    }

    @Override
    public void chargeIphone() {
        androidCharge.chargeAndroidPhone();
        System.out.println("Your phone is charging with adapter------");
    }
}
