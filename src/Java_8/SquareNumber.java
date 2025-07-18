package src.Java_8;

import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SquareNumber {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 9, 5, 6);
        System.out.println("Original list: " + list);
        System.out.println("Square numbers: " + squareNum(list));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to multiply by : ");
        int num = sc.nextInt();
        System.out.println("Multiplied list: " + multiplyByTwo(list, num));

        // Using Supplier to create a new String object
        Supplier<String> stringSupplier = String::new;
        String str = stringSupplier.get();


        IntStream stream = IntStream.range(1, 10);
        System.out.println("Range of numbers: " + stream.boxed().collect(Collectors.toList()));

        //Generators in Stream API
        Stream<String> generator = Stream.generate(()->"Hello Shubh");
        String res = generator
                .limit(1)
                .collect(Collectors.joining());
        System.out.println("Generated String: " + res);

        System.out.println("Finding the distinct in List ");

        List<Integer> numbers = List.of(1, 2, 9,8,65,8,7,6,5,3, 3, 4, 5, 5, 6);
        List<Integer> distict = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distict);

        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println( "sorted List is : "+sorted);
    }



    public  static  List<Integer> squareNum( List<Integer> numbers) {
        List<Integer> squareNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        return squareNumbers;
    }
    public static List<Integer> multiplyByTwo(List<Integer> numbers, int num) {
        return numbers.stream()
                .map(n ->n*num)
                .collect(Collectors.toList());
    }
}
