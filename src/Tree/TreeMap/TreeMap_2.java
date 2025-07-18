package src.Tree.TreeMap;

import java.util.TreeMap;

public class TreeMap_2 {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(6,30);
        map.put(7,50);
        map.put(9,60);
        System.out.println(map);
//        System.out.println(map.containsKey(3));
        System.out.println(map.floorKey(8));// this will give the just smaller key of 8
        System.out.println(map.floorEntry(8));// this will give the just smaller value of 8
        System.out.println(map.ceilingKey(8));// this will give the just grater key of 8
        System.out.println(map.ceilingEntry(8));// this will give the just grater value of 8
        System.out.println(map.lastKey());// this will give the largest key stored in the tree map
        System.out.println(map.firstKey());// this will give the smallest key stored in the tree map



    }
}
