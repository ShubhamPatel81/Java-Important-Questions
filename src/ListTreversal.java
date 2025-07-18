package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTreversal {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Ram");
        list.add("Shyam");
        list.add("Golu");
        list.add("Hello");

        System.out.println("1. +++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // First Way of Traversal,
        for (int i = 0 ; i <= list.size()-1; i++){
            System.out.println(list.get(i));
        }

        System.out.println("2. +++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // second way
        System.out.println(list.stream().toList());

        System.out.println("3. ++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // Third Way
        for (String str:list){
            System.out.println(str);
        }

        System.out.println("4. ++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Forth Way --> in this we can traverse only forward direction
        Iterator<String>itr= list.iterator();
        while (itr.hasNext()){
           String element = itr.next();
            System.out.println(element);
        }


        System.out.println("5. ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Fifth Way
        // ListIterator -> in this we can traverse forward and backward direction also

       ListIterator <String > listIterator=  list.listIterator();
        while (listIterator.hasNext()){
            String element = listIterator.next();
            System.out.println(element);
        }

        System.out.println("++++++++++=REVERSE++++++++++++++++++++++USING LIST ETRATOR++++++");
        ListIterator<String> listReverse =list.listIterator(list.size());
        while (listReverse.hasPrevious()){
            String preveious= listReverse.previous();
            System.out.println("Reverse of the list is : "+preveious);
        }


        System.out.println("6. +++++++++++++++++++++++++++++++++++++++++++++++++++");
        // Sixth Way
        list.forEach((element)->{
            System.out.println(element);
        });

        System.out.println("7. ++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Seventh Way
        list.stream().forEach((element)->{
            System.out.println(element);
        });

    }
    
}
