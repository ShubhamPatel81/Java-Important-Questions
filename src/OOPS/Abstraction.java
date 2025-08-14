package src.OOPS;
// Abstraction is the hiding of the implementation of methods and you can write your implementation according to the use
abstract class Animal{
   abstract void  walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs....");
    }
}
class Chiken extends Animal{
    public void walk(){
        System.out.println("Walks in 2 legs.....");
    }
}
public class Abstraction {
    public static void main(String[] args) {

    }
}
