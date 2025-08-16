package src.Java_8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("java".repeat(2));

        List<Integer> numbers = IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());

        // Parallel processing
        numbers.parallelStream()
                .map(n ->n * n)// compute sqaure
                .forEach(n -> System.out.println(Thread.currentThread().getName()+" "+n));
    }
}
