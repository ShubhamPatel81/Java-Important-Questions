package src.Tree.TreeMap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//we are creating the custom data and based on that we are going to sort
class Students implements  Comparable<Students> {
    int rollNo;
    int marks;
    String name;

    public Students(int rollNo, int marks, String name) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Students that) {
        //sort it based on the increasing order of roll no
//        return this.rollNo - that.rollNo;
        if (that.marks ==this.marks){
            if (this.rollNo == that.rollNo){
                return this.name.compareTo(that.name);
            }
            return this.marks - that.marks;
        }
        return that.marks - this.marks;
    }
    public String toString(){
        return "Students : "+this.name;
    }
}

public class TreeMap_Impl {
    public static void main(String[] args) {
//        TreeMap<Students,Integer> treeMap = new TreeMap<>(Collections.reverseOrder());// this will print in the reverse sorted order
        TreeMap<Students, Integer> treeMap = new TreeMap<>();
        treeMap.put(new Students(3,50, "Amam"),10);
        treeMap.put(new Students(1,56,"Guru"),12);
        treeMap.put(new Students(9,23,"Shyam"),18);
        treeMap.put(new Students(7,98, "Topper"),14);
        treeMap.put(new Students(2,78, "Rohit"),15);

        Students obj = new Students(2,78, "Piyush");//using contains key☺
        System.out.println(treeMap.containsKey(obj));

        System.out.println(treeMap);

//        System.out.println(treeMap.get(1));
//        System.out.println(treeMap.getOrDefault(1,19));
//        System.out.println(treeMap.containsKey(4));

        for (Map.Entry<Students,Integer> entry: treeMap.entrySet()){
            System.out.print("Key -> "+entry.getKey());
            System.out.println(" ,Value -> "+entry.getValue());
        }
    }
}
