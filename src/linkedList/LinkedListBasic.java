package src.linkedList;

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.addFirst("Shubh");
        list.addLast("Yaksh");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
    }
}
