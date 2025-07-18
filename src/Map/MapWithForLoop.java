package src.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapWithForLoop {
    public static void main(String[] args) {
        Map<String, Integer> map  = new HashMap<>();
        map.put("Rohit", 100);
        map.put("Shyam", 231);
        map.put("shubh",200);

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.print("Key: "+ entry.getKey());
            System.out.print("Value: "+entry.getValue());
        }

    }
}
