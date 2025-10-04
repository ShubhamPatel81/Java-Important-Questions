package src.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class College{
    int collegeRanking;
    private int hashCode;
    College(int collegeRanking){
        this.collegeRanking=collegeRanking;
        this.hashCode = Objects.hashCode(collegeRanking);
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        College c = (College) obj;
        return this.collegeRanking == collegeRanking;
    }
}

class Ranking{
    int rank;
    Ranking(int rank){
        this.rank=rank;
    }

    @Override
    public String toString() {
        return ""+this.rank;
    }

    @Override
    public boolean equals(Object obj) {
        Ranking r = (Ranking) obj;
        return this.rank == r.rank;
    }
}
public class CustomHashMap {
    public static void main(String[] args) {

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        System.out.println(map);
        System.out.println(map.get(3));
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Key-> "+entry.getKey());
            System.out.println("Value-> "+entry.getValue());
        }

        HashMap<College,Ranking> map1 = new HashMap<>();
        map1.put(new College(11),new Ranking(1));
        map1.put(new College(12),new Ranking(2));
        map1.put(new College(13),new Ranking(3));
        map1.put(new College(14),new Ranking(4));
        map1.put(new College(15),new Ranking(5));
//        System.out.println(map1.toString());
        System.out.println(map1.get(new College(11)));
        System.out.println(map1.containsValue(new Ranking(1)));

    }
}
