package src.Java_8;


interface AB{
    static void sayHello() {
        System.out.println("This is the static method in interface called without overriding in the implementation class !!");

    }
    static void sayOneMoreHello(){
        System.out.println("Say one more hello !!!!");
    }


}

public class StaticMethodInInterface implements AB {
    public static void main(String[] args) {
        AB.sayHello();
        AB.sayOneMoreHello();
    }
}
