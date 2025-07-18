package src.LinkedListSol;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class LinedListDesign {


    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(3);
        list.addLast(9);
        list.addFirst(1);
        list.add(1,12);
        list.add(2,13);

        System.out.println(list);

        list.removeFirst();
        list.remove(1);
        list.removeLast();
        System.out.println(list);
    }

}
