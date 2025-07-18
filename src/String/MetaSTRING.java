package src.String;

import java.util.Scanner;

public class MetaSTRING {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String 1: ");
        String str1 = sc.next();
        System.out.print("Enter the String 2: ");
        String str2 =sc.next();

        System.out.println("Both String are : "+str1 +" and "+ str2);
        meatString(str1,str2);
    }

    static  boolean meatString(String str1, String str2){
        if (str1.length() != str2.length() || str1.equals(str2)){
            System.out.println("This is not Meta String");
            return false;
        }
        if (str1.equals(str2)){
            System.out.println("Both are equals");
            return false;
        }

        int mmc=0;
        int fi = -1;
        int si = -1;
        for (int i = 0 ; i< str1.length()-1; i++){
            if (str1.charAt(i) != str2.charAt(i)){
                mmc++;
                if (mmc ==1){
                    fi = i;
                }
                else if (mmc==2){
                    si=i;
                }
                else {
                    System.out.println("Mismatch is greater then two");
                    return false;
                }
            }
        }
        if (mmc ==2){
            if (str1.charAt(fi) == str2.charAt(si) && str1.charAt(si) == str2.charAt(fi)){
                System.out.println("IT is Meta String !!");
                return true;
            }

        }
        else {
            System.out.println("Its not metastring ");
            return false;
        }
        return false;
    }

}
