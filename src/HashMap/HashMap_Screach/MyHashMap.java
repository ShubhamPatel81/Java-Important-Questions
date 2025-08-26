package src.HashMap.HashMap_Screach;

import src.InnerClasses.Anonymous_InnerClass.Payment;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap <K,V>{
// Initializing the hashmap form the scratch

    class Node{
        K Key;
        V Value;
        Node(K key,V value){
            this.Key = key;
            this.Value = value;
        }

        @Override
        public String toString() {
            return  Key+" : "+Value;
        }
    }

   private LinkedList<Node> hashTable [];
   private int element ;
    private int tableSize;
   private double threshold;

   MyHashMap(){
       element =0;
       tableSize = 16;
       threshold=0.75;
        hashTable=new LinkedList[tableSize];
        initializeHashTable();
   }

    private void initializeHashTable() {
       for (int i = 0; i<tableSize;i++){
           hashTable[i] = new LinkedList<>();
       }
    }
    private int getHashCode(K key){
       int hashCode= Objects.hash(key);
       hashCode=(Math.abs(hashCode))%tableSize;
        return hashCode;
    }
    private int serarchKeyInList(K key,int hashCode){
       LinkedList<Node> list= hashTable[hashCode];
       for (int index = 0; index<list.size();index++){
           if (list.get(index).Key.equals(key)){
               return index;
           }
       }
        return -1;
    }
    private void rehash(){
       LinkedList<Node> oldTable[] =hashTable;
       tableSize=2*tableSize;
       element = 0;
       hashTable =new LinkedList[tableSize];
       for (LinkedList<Node>list:oldTable){
           for (Node node:list) {
               put(node.Key,node.Value);
           }
       }


    }
    public void put(K key,V value){
       // find the hashCode
        int hashcode= getHashCode(key);
        int index = serarchKeyInList(key,hashcode);
        Node node = new Node(key,value);
        if (index == -1){
            // insert into the linkedList
            hashTable[hashcode].add(0,node) ;
            element++;
        }
        else {
            ///update
            hashTable[hashcode].get(index).Value=value;

        }
        if (element/(double)tableSize>=threshold){
            rehash();
        }
    }
    public V get(K key){
       // find the hashcode
        int hashcode= getHashCode(key);
        int index = serarchKeyInList(key,hashcode);
        if (index == -1){
            // insert into the linkedList
          return null;
        }
        else {
            ///update
           return hashTable[hashcode].get(index).Value;
        }
    }
    public boolean containsKey(K key){
       // find the hashcode
        int hashcode= getHashCode(key);
        int index = serarchKeyInList(key,hashcode);
        if (index == -1){
            // insert into the linkedList
          return false;
        }
        else {
            ///update
           return true;
        }
    }

    public V remove(K key){
        // find the hashCode
        int hashcode= getHashCode(key);
        int index = serarchKeyInList(key,hashcode);
        if (index == -1){
          return  null;
        }
        else {
           V value = hashTable[hashcode].get(index).Value;
           hashTable[hashcode].remove(index);
           element--;
           return value;
        }
    }
    public void iterate(){
       for (int i = 0;i <tableSize; i++){
           for (Node node:hashTable[i]){
               System.out.println(node);
           }
       }
    }
    public  boolean isEmpty(){
       return (element == 0);
    }
    public boolean containsValue(V value) {
        // find the hashcode

        for (int i = 0; i < tableSize; i++) {
            for (Node node : hashTable[i]) {
                if (node.Value.equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }
    public int size(){
       return element;
    }
}
