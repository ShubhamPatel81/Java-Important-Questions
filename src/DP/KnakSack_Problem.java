package src.DP;

import java.util.Map;

public class KnakSack_Problem {
    // This is 0/1 KnapSack problem
    // using recursion pick and noPick method
    static  int kanpSackRecur(int capacity, int val[], int weight[]){
        int n = val.length;
        return  recur(capacity,val, weight, n-1);
    }
    static  int recur(int capacity, int val[], int wt[], int idx){
        //base case
        if (capacity == 0) return 0;
        if (idx == 0){
            if (wt[idx]<=capacity) return val[idx];
            else return 0;
        }
        int pick = 0;
        if (wt[idx] <= capacity){
            pick = val[idx] + recur(capacity - wt[idx], val, wt, idx-1);
        }
        int noPick = 0 + recur(capacity,val, wt, idx-1);
        return Math.max(pick,noPick);
    }

    public static void main(String[] args) {
        int capacity = 4;
        int val[] = {1,2,3};
        int wt [] ={4,5,1};
        int ans = kanpSackRecur(capacity,val,wt);
        System.out.println("Using recursion method knapSack is : " + ans);
    }
}
