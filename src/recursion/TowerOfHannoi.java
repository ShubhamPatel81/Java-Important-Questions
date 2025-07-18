package src.recursion;

public class TowerOfHannoi {


    static  void  hannoi(int n , char x, char y,char z) {
//        if (n<0){
//            return;
//        }
        if (n > 0) {
            hannoi(n - 1, x, y, z);
            System.out.println(n + " = " + x + " to " + y);
            hannoi(n - 1, z, y, x);
        }
    }

    public static void main(String[] args) {

        hannoi(3,'A','B','C');
    }
}
