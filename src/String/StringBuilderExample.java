package src.String;

public class StringBuilderExample {

    // String builder is a mutable class used to modify string
    // When we need to performance and memory optimization

    public static void main(String[] args) {

        String str = "hello";
        System.out.println("String is :"+str);
        StringBuilder sb = new StringBuilder();
        System.out.println("Reverse of the string is : "+sb.append(str).reverse().toString());
    }
}
