package src;

public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length>0){
            System.out.println("Command Line Arguments are : ");
            for (String val: args){
                System.out.println(val);
            }

        }
        else {
            System.out.println("NO command line argument found");
        }
        float num = 343.00f;
        System.out.printf("number is : %f", num);
    }
}
