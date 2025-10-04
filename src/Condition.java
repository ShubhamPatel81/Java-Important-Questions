package src;

public class Condition {
    public static void main(String[] args) {
        int number = 20;
        boolean boo = false;
        if (boo == true && ((number += 20)==30)){
            System.out.println("Hello to : "+ number);
        }else {
            System.out.println("World! : "+number);
        }
    }
}
