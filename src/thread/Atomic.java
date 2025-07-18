package src.thread;

import java.util.concurrent.atomic.AtomicInteger;

class SharedCounter{

    // Using AtomicInteger
    private AtomicInteger count = new AtomicInteger(0);
    public  void increment (){
        count.incrementAndGet();
    }
    public int  getCount(){return count.get(); }

    // Using Synchronize method
    public  int count1 ;
    public synchronized  void increment1(){
//       System.out.println("No need of locks");
//        synchronized (this){
        count1++;
//        }
    }
    public int getCount1(){
        return count1;
    }
}
public class Atomic {
    // AtomicInteger or Synchronize KeyWord is used to Solve the Race Condition in the Java Thread
// AtomicInteger is faster than the Synchronize
// while Synchronize is locks based whereas AtomicInteger is the instant hardware support
// or you can also use static method also to remove the Race Condition

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

//        Thread 1

        Thread t1 = new Thread(()->{
            System.out.println("Thread 1 started");
            for (int i = 0 ;i < 5000; i++){
                sharedCounter.increment();
            }
            System.out.println("Thread 1 completed");
        });

//        Thread 2
        Thread t2 =  new Thread(()->{
            System.out.println(("Thread 2 started"));
            for (int i = 0; i < 5000;i++){
                sharedCounter.increment();

            }
            System.out.println("Thread 2 completed");
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException w){
            w.printStackTrace();
        }
        System.out.println("Final Thread using AtomicIncrement method "+sharedCounter.getCount());


        System.out.println("Synchronize method start !!!!!");
        // Using Synchronize method
        Thread t3 = new Thread(()->{
            System.out.println("Thread 3 start");
            for (int i =0 ;i < 5000 ; i++){
                sharedCounter.increment1();
            }
            System.out.println("Thread 3 completed");
        });

        Thread t4 = new Thread(()->{
            System.out.println("Thread 4 started ");
            for (int i= 0; i< 5000; i++){
                sharedCounter.increment1();
            }
            System.out.println("Thread 4 completed");
        });

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final Thread using Synchronize method "+sharedCounter.getCount1());

    }


}
