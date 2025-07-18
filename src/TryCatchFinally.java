package src;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block ");
            int a = 5 / 0;
        }catch (ArithmeticException e){
            System.out.println("catch Block with return operation"+e);
            return;
        }finally {
            System.out.println("Finally Executed");
        }
    }
}
