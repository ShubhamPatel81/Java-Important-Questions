package src;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Enter Number 3 : ");
        int num3 = sc.nextInt();

        System.out.println("All the conditions are :::: ");
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 > num2);

        System.out.println(num1 > num2 ? "Num1 is greater" : "num2 is grater");


        System.out.println(num1 & num2);

        System.out.println(num1 > 0 ? "Its Positive number " : "Negative number");


        System.out.println("Left Shift Operator and right Shift Operator");
        int number = 8;
        System.out.println("Left Operator << : " + (number << 2));

        System.out.println("Right OOperator >> : " + (number >> 2));

        System.out.println("Minimum of two numbers is : " + (num1 < num2 ? num1 : num2));
        int greatest;

        // Finding the greatest number
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        System.out.println("Greatest among the three numbers: " + greatest);

        System.out.println("Printing the day by input the numbers : ");
        switch (num1){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
             case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }

        System.out.println("Printing HII HELLO------ "+ num3);
        if ((num3 % 3 ==0) && (num3 % 5 ==0 )) {
            System.out.println( "HI HELLO!!!!");
        }
         else if (num3 % 3 ==0){
            System.out.println("Hi");
        } else if (num3 % 5== 0) {
            System.out.println("Hello");
        }
        else {
            System.out.println("NONE");
        }
    }
}
