package src.JavaInterviewProgrammingQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the array:");
        int arr[] = new int[n];
        for (int i = 0 ; i<n ; i++){
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i<n; i++){
            if (arr[i] != arr[j]){//  If current element is different from the last unique element
                j++;
                arr[j] = arr[i];// Move the unique element to the next position
            }
        }
        System.out.println("After removing the duplicates form the array: ");
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nRemove duplicates using HashSet: ");
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n ; i++){
            hashSet.add(arr[i]);
        }
        System.out.println(hashSet);

        System.out.println("Remove Duplicates using LinkedHashSet: ");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i<n; i++){
            linkedHashSet.add(arr[i]);
        }
        System.out.println(linkedHashSet);
    }
}
