package src.Competative_Programming.NumberTheoryAndMath;

import java.util.Random;

public class OTPGeneration {
    public static void main(String[] args) {
        Random random= new Random();
        String opt = "";
        for (int i = 0; i< 4; i++){
            int digit = random.nextInt(10);
            opt+= digit;
        }
        System.out.println("OTP is : "+ opt);
    }
 
}
