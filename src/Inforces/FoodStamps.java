package src.Inforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FoodStamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();

        long v [] = new long[n];
        long d[] =new long[n];

        for (int i = 0 ;  i < n;i++){
            d[i] = sc.nextLong();
        }
        ArrayList<Long> values = new ArrayList<>();
        // Generate all positive taste values
        for (int i = 0; i < n; i++) {

            long current = v[i];

            while (current > 0) {
                values.add(current);
                current -= d[i];
            }
        }
        // Sort descending
        values.sort(Collections.reverseOrder());

        long ans = 0;

        // Take top M meals
        for (int i = 0; i < Math.min(m, values.size()); i++) {
            ans += values.get(i);
        }

        System.out.println(ans);


}
}
