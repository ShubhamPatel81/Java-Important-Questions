package src.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class BucketSort {
    public static void main(String[] args) {
        float arr[] ={0.78f,0.17f,0.39f,0.26f,0.72f,0.94f,0.21f,0.12f,0.23f,0.68f};
        ArrayList<Float> res = bucketSort(arr);
        System.out.println(res);
    }
    public static ArrayList<Float> bucketSort(float[] arr){
        if (arr.length==0)return new ArrayList<>();
        float maxElement = findMax(arr);
        int maxIndex=(int)(maxElement*arr.length);
        int bucketSize=maxIndex+1;
        ArrayList<Float> bucket[] = new ArrayList[bucketSize];
        for (int i = 0 ; i< bucketSize;i++){
            bucket[i] = new ArrayList<>();
        }
        // insert element into the bucket
        for (int i = 0;i< arr.length; i++){
            int index =(int) (arr[i]*arr.length);
            bucket[index].add(arr[i]);
        }
        // sort the buckets
        for (int i = 0 ; i < bucketSize; i++){
            Collections.sort(bucket[i]);
        }
        // store the element into result list
        ArrayList<Float> res = new ArrayList<>();
        for (int i = 0 ; i < bucketSize; i++){
            System.out.println("Buckets["+i+"] -> "+bucket[i]);
            for (Float element: bucket[i]){
                res.add(element);
            }
        }


        return res;
    }

    private static float findMax(float[] arr) {
        float maximum =Float.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            maximum = Math.max(maximum,arr[i]);
        }
        return maximum;
    }
}
