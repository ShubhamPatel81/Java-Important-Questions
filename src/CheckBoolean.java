package src;

public class CheckBoolean {
    static  boolean b1,b2;
    public static void main(String[] args) {
        int x = 3;
        if (!b1){
            if (!b2){
                b1 = false;
                x++;
                if (10 < 20){
                    x++;
                }
                if (!b1){
                    x = x +30;
                } else if (b2== true) {
                    x = x +111;
                } else if (b1 | b2) {
                    x = x+1010;
                }
            }
        }
        System.out.println(x);
    }

}
