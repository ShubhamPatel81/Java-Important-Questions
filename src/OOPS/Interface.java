package src.OOPS;

public class Interface {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.calculateArea();
        circle.display();
        circle.printSome();
        Shape shape = new Circle(10);
        shape.printSome();


    }
}
interface  Shape{
    String name="Interface";
    void display();
    void  calculateArea();

    // You can declare the (private, static and Default )method as non-abstract method into interface -> but it should declare with body
    private void greetUser(){
        System.out.println("Welcome User");
    }
    default void printSome(){
        System.out.println("This is default method inside the interface");
    }
    static void printName(){
        System.out.println("Name is : "+name);
    }
}
class Circle implements Shape{
    private final double pi = 3.14;
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Shape is CIRCLE");

    }
    @Override
    public void calculateArea() {
        double area = pi * radius * radius;
        System.out.println("Area of CIRCLE is:  "+area);
    }
}