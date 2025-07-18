package src.recursion;

import java.util.Scanner;


// this is example of direct recursion --
  // types is direct recursion --> (i) . Head recursion   (ii) . Tail recursion


// indirect recursion
//when two or more  times function call itself

public class PrintingNumber {
    static  void  recursion(int a){
        if (a <0){
            return;
        }
        // Head Recursion

//      recursion(a-2);
        if ((a&1) ==0){
            System.out.print(a+" ");
        }

        add(a-2);// Tail Recursion
    }
    static  void  recursion1(int a){
        if (a <1){
            return;
        }
        System.out.print(a+" ");
        sub(a-1);
    }

    static  void add(int  a){
        if (a <0){
            return;
        }
            System.out.print(a+" ");
            recursion1(a);

    }
    static  void  sub(int a ){
        if (a <0){
            return;
        }
            System.out.print(a+" ");
            recursion(a);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
//        if (a>=0){
//            recursion1(a);
//        }
//     else {
//            System.out.println("Enter the value greater then 0");
//        }

        recursion1(a);
     sc.close();
    }
}
