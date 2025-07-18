package src.LinkedListSol;

import java.util.LinkedList;

public class Adding_Two_LinkedList {

    public static void mergeLinkedList(LinkedList<String> list1, LinkedList<String> list2){

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i< list1.size(); i++){
            list.add(list1.get(i));
        }
        for (int i = 0 ; i< list2.size(); i++){
            list.add(list2.get(i));
        }

        list.addAll(list1);

        System.out.println("Final List : ");
        System.out.println(list);

    }
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Red");
        list1.add("green");
        list1.add("yellow");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("blue");
        list2.add("red");
        list2.add("purple");
        System.out.println(list1);
        System.out.println(list2);
        mergeLinkedList(list1,list2);
    }
}
