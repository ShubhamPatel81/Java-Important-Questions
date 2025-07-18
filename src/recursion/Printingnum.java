package src.recursion;

public class Printingnum {
    static  void printNum1(int num){
        if (num < 1) return;
        System.out.println(num);
        printNum1(num-1);
    }
    public static void main(String[] args) {
        printNum1(5);
    }
}
