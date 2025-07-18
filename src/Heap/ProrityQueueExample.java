package src.Heap;

import java.lang.invoke.StringConcatFactory;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class NewStudents implements  Comparable<NewStudents>{
    int marks;
    String name;

    public NewStudents(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewStudents{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(NewStudents that) {
        return this.marks - that.marks;// increasing order sort
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  NewStudents) {
            NewStudents that = (NewStudents) obj;
            if (this.marks == that.marks && (this.name.compareTo(that.name)) == 0) {
                return true;
            }
        }
        return false;
    }
}

public class ProrityQueueExample {


    public static void main(String[] args) {
        PriorityQueue<Integer> minpq = new PriorityQueue<>();// by default Priority Queue will be ->  min priority queue
        minpq.offer(1);
        minpq.offer(3);
        minpq.offer(34);
        minpq.offer(12);
        minpq.offer(10);
        System.out.print("Min Priority Queue: ");
        System.out.println(minpq);
        System.out.println("Highest priority Element in min Priority Queue: " + minpq.peek());

        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        maxPq.offer(1);
        maxPq.offer(3);
        maxPq.offer(34);
        maxPq.offer(12);
        maxPq.offer(10);
        System.out.print("Max Priority Queue : ");
        System.out.println(maxPq);
        System.out.println("Highest priority Element in max Priority Queue: " + maxPq.peek());

        System.out.println(maxPq.contains(10));

        PriorityQueue<NewStudents> minStudents = new PriorityQueue<>();
        minStudents.offer(new NewStudents(89, "Shubh"));
        minStudents.offer(new NewStudents(98, "Rahul"));
        minStudents.offer(new NewStudents(87, "Guru"));
        minStudents.offer(new NewStudents(65, "Akash"));
        System.out.println(minStudents);
        System.out.println(minStudents.peek());
        System.out.println(minStudents.contains(new NewStudents(89, "Shubh")));

//        System.out.println(minpq.isEmpty());
    }
}
