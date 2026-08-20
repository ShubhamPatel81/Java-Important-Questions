package src.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinStoneSum_1962 {
        public static int minStoneSum(int[] piles, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int p : piles){
                pq.add(p);
            }
            while(k > 0){
                int largest = pq.poll();
                largest = largest - (largest/2);
                k--;
                pq.add(largest);
            }
            int sum =0;
            while (!pq.isEmpty()){
                sum += pq.poll();
            }
            return sum;
        }

    public static void main(String[] args) {
      int [] piles = {5,4,9};
      /*
      1st opertaion =  pq =[9,5,4]
                        largest = 9 , largest = 9 - (9/2) . i.e - 9-4=5
                        because remove floor value (9/2 = 4.5) . so remove floor is 9-4=5
       */
        int k = 2;
       int sum =  minStoneSum(piles,k);
        System.out.println("Minimum Sum of stone is : "+ sum);
    }

}
