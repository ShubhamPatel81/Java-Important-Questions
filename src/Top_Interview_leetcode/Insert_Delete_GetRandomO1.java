package src.Top_Interview_leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

//Input
//        ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
//        [[], [1], [2], [2], [], [1], [2], []]
//Output
//        [null, true, false, true, 2, true, false, 2]
public class Insert_Delete_GetRandomO1 {  private HashMap<Integer, Integer> hm; // Map to store value and its index in the list
    private List<Integer> list;          // List to store values for random access

    public Insert_Delete_GetRandomO1() {
        hm = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (hm.containsKey(val)) {
            return false; // Value already exists
        }
        list.add(val); // Add value to the list
        hm.put(val, list.size() - 1); // Map the value to its index in the list
        return true;
    }

    public boolean remove(int val) {
        if (!hm.containsKey(val)) {
            return false; // Value does not exist
        }

        // Get index of the value to be removed
        int index = hm.get(val);

        // Swap the value with the last element in the list
        int lastValue = list.get(list.size() - 1);
        list.set(index, lastValue);
        hm.put(lastValue, index);

        // Remove the last element
        list.remove(list.size() - 1);
        hm.remove(val);

        return true;
    }

    public int getRandom() {
        Random random = new Random();
        int randomIndex = random.nextInt(list.size()); // Generate a random index
        return list.get(randomIndex); // Return the value at the random index
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
