package src;

public class WithoutMainMethodPrinting {
      static {
        System.out.println("This is printing Something without public static void main method (String args[])");
        System.exit(0);
    }
}
