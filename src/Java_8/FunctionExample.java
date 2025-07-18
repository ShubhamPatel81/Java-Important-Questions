package src.Java_8;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String,String> function1 = x -> x.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0,4);
        Function<String, String> stringStringFunction = function1.andThen(function2);
//        System.out.println(stringStringFunction.apply("Shubham Patel"));
        System.out.println(function1.andThen(function2).apply("Shubham Patel"));


        Function<Integer,Integer> f1 = x -> x*2;
        Function<Integer, Integer> f2 = x -> x*3;
        System.out.println(f1.andThen(f2).apply(3));
        System.out.println(f2.andThen(f1).apply(3));
        System.out.println(f1.andThen(f1).apply(3));
        System.out.println(f2.andThen(f2).apply(3));


        System.out.println(f1.compose(f2).apply(3));

        Function<String, String> identity = Function.identity();
        System.out.println(identity.apply("SHubham"));

    }
}
