package src.linkedList;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinOfList {
    public static void main(String[] args) {
        List<Integer> list =
                Arrays.asList(14,12,43,12,56,34,2,34,7,87,9,87,65,3);


//        MAX AND MIN


        int max = list.stream()
                .max(Integer::compareTo).get();

        int min  = list
                .stream().min(Integer::compareTo).get();

        System.out.println("Maximum is: "+ max);
        System.out.println("Minimum is: "+min);

    }
}
