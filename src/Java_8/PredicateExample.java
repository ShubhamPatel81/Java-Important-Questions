package src.Java_8;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> salaryGraterThan1Lakh = x -> x > 100000;
        System.out.println(salaryGraterThan1Lakh.test(6555));
        Predicate<String> p1 = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(p1.test("Viraj"));

        Predicate<String> p2 = x -> x.toLowerCase().charAt(x.length()-1) == 'L';

        System.out.println(p1.and(p2).toString());

        BiPredicate<Integer, Integer> biPredicate =(x,y)->x % 2 == 0 && y % 2 ==0;
        System.out.println(biPredicate.test(2,8));
    }
}
