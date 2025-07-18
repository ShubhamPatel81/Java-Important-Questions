//
//347. Top K Frequent Elements
//        Medium
//        Topics
//        premium lock icon
//        Companies
//        Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [1,1,1,2,2,3], k = 2
//        Output: [1,2]
//        Example 2:
//
//        Input: nums = [1], k = 1
//        Output: [1]


package src.Heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Number implements Comparable<Number>{
    int element;
    int frequency;
    Number(int element , int frequency){
        this.element = element;
        this.frequency = frequency;
    }
    @Override
    public int compareTo(Number that){

        //max heap
//        return that.frequency - this.frequency;//decending order

        //min heap
        return this.frequency - that.frequency;
    }
}

public class PriorityQueue_leetcode_347 {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Number> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        // insert the element into the priority queue
        for(Map.Entry<Integer,Integer> entry :map.entrySet() ){
            Number n = new Number(entry.getKey(),entry.getValue());
            pq.offer(n);
            //this will  restrict the element tofollow the min heap
            if(pq.size()> k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        int idx = 0;
        while(idx < k){
            Number n = pq.poll();
            res[idx] = n.element;
            idx++;
        }
        return res;
    }

    public static void main(String[] args) {
        PriorityQueue_leetcode_347 obj = new PriorityQueue_leetcode_347();
        int[] result = obj.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        System.out.println("Priority Queue of top most element is : ");
        System.out.print(Arrays.toString(result));

    }
}
