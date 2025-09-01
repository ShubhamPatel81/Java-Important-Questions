package src.OOPS;

class  A {
    int a , b;
    void add(){
        a = 10; b = 20;
        System.out.println("Sum is : "+(a+b));
    }
}
class B extends A{}
class  C extends B{}
public class Inheritence {
    public static void main(String[] args) {
        C c = new C();
        c.add();
    }

}
