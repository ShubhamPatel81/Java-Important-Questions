package src.Heap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Task implements Comparable<Task>{
    int freq;
    int executionTime ;
    Task(int f, int t){
        this.freq =f;
        this.executionTime =t;
    }
    public int compareTo(Task that){
        return that.freq - this.freq; // decreasing order
    }
}
public class Task_Scheduer {
        public int leastInterval(char[] tasks, int n) {

            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch: tasks){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            // insert into PriorityQueue
            PriorityQueue<Task > pq  = new PriorityQueue<>();
            // insert into pq from map with freq
            for(Character ch: map.keySet()){
                int freq =map.get(ch);
                pq.offer(new Task(freq,0));
            }
            //insert into queue and check the execution time and again insert into the pq
            Queue<Task> queue = new LinkedList<>();
            int time =0;
            while(!queue.isEmpty() || !pq.isEmpty()){
                time ++;
                if(!pq.isEmpty()){
                    Task task = pq.poll();
                    task.freq--;
                    if(task.freq > 0){
                        task.executionTime = time +n;
                        queue.offer(task);
                    }
                }
                if(!queue.isEmpty() && queue.peek().executionTime == time){
                    pq.offer(queue.poll());
                }
            }
            return time;
        }
}

