package src;
class MathOperations {
    // Method 1: No parameters
    void add() {
        System.out.println("No parameters to add.");
    }

    // Method 2: Two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 3: Three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 4: Two doubles
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();

        obj.add(); // Calls the first method
        System.out.println("Sum: " + obj.add(10, 20)); // Calls second method
        System.out.println("Sum: " + obj.add(10, 20, 30)); // Calls third method
        System.out.println("Sum: " + obj.add(10.5, 20.5)); // Calls fourth method
    }
}
