package src.Java_8;

interface  A{
    default void sayHello(){
        System.out.println("Hello, from class A !!");
    }

}

interface B{
      default void sayHello(){
         System.out.println("Hello, from class B !!");
     }
//     write on more method here
     static void anotherUsingStatic(){
        System.out.println("This is another method using static method. Using static we can create n number of interface method !!!");
    }

     static void another(){
        System.out.println("Creating n number of interface using Static keyword ");
    }
}
public class default_Interface implements  A, B{

    @Override
    public void sayHello() {
        B.super.sayHello();
    }

    public static void main(String[] args) {
        default_Interface d = new default_Interface();
        d.sayHello();

        B.another();
        B.anotherUsingStatic();

    }


}
