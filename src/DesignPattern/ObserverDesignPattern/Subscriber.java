package src.DesignPattern.ObserverDesignPattern;

public class Subscriber implements Observer{

    String name;
    Subscriber(String name){
        this.name =name;
    }
    @Override
    public void notified() {
        System.out.println("Hello,"+name+ " new video upload : notification");
    }
}
