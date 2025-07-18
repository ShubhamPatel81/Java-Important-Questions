package src;

import java.util.Map;
import java.util.Scanner;

public class InputStream {
    public static void main(String[] args) {
//

        // printing the args input from the terminal
      /*
        for (String arg : args){
            System.out.println(arg);
        }

        int A = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        char k = args[2].charAt(0);
        boolean l =Boolean.parseBoolean(args[3]);

        System.out.println("Sum of  args using command line : "+ (A+ m));
        System.out.println("Character is : "+k);
        System.out.println("Printing boolean value is : "+l);

*/
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter  s1 : ");
//        String s1 = sc.next();
//        sc.nextLine();
//        System.out.println("Enter s2 : ");
//
//        String s2 = sc.nextLine();
//
//        System.out.println("s1 is : "+ s1);
//        System.out.println("s2 is : "+ s2);


        int a = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        System.out.println("Integer is " + a);
        System.out.println("String is : "+ c);


        int o = 9;
        System.out.println("printing double shift :\n"+(o<<2));
        System.out.println(o >>4);
        System.out.println(o>>1);
    }
}
