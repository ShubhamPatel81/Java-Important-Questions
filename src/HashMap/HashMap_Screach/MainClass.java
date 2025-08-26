package src.HashMap.HashMap_Screach;

public class MainClass {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<>();
        map.put(1,"Hello");
        map.put(2,"Hello");
        map.put(3,"Hello");
        System.out.println(map.get(2));
        map.put(2,"World");
        System.out.println(map.get(2));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(5));
        map.iterate();
        System.out.println(map.containsValue("World"));
        System.out.println(map.containsValue("qweqweq"));
        System.out.println(map.remove(2));
        System.out.println(map.remove(5));
        map.iterate();
    }
}
