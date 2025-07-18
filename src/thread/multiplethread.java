package src.thread;

import java.util.concurrent.ThreadPoolExecutor;

// first way to create and run a thread
class  MyThread extends Thread{
    public void run(){
        System.out.println("Thread 1 is running ");
    }
}

public class multiplethread {
    public static void main(String[] args) {
        System.out.println("Multithreading basic code ");
        MyThread thread = new MyThread();
        thread.start();

        // Second way to create and run the thread using lambda expression
        Thread objThread = new Thread(()->{
            System.out.println("Thread 2 is start ");
        });
        objThread.start();

        // best way to run the thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running ");
            }
        };


        // using lambda expression Runnable method run
        Runnable objThread4 =()->{
            System.out.println("Thread 4 is running using lambda expression");
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 4 is completed");

        };

        Thread objThread3 = new Thread(runnable, "Runnable Thread 3");
        Thread obThread4 = new Thread(objThread4, "Runnable Thread 4");

        obThread4.setDaemon(true);
        System.out.println("Thread 4 is ended" );



        objThread3.start();
        obThread4.start();


    }
}
