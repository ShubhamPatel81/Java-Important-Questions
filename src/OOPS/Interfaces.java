package src.OOPS;

interface Animals{
    void walk();
//    void eat(){
//
//    }
    // we can't give the body of any method inside the interface class
}
class Horses implements Animals{

    @Override
    public void walk() {
        System.out.println("Horse inside the interface  ");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Horses horses = new Horses();
        horses.walk();
    }
}
