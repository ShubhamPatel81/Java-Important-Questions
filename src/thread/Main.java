package src.thread;

public class Main {
    public static void main(String[] args) {

//        ThreadClassUsingRunnable t1 = new ThreadClassUsingRunnable();

//        t1.start();-->java.lang.Thread--> this thread don't have their own start() methode
//        t1.run();

//        Thread thread = new Thread(t1);
//        t1.start();


//        ThreadUsingThreadClass t2 = new ThreadUsingThreadClass();
//        t2.start();

//        Creating Anonymous thread class

        Runnable t1R = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is the anonymous class thread");

            }
        };
        Thread t = new Thread(t1R);
        t.start();


        // Using Lambda Expression
        Runnable r = ()->{
            System.out.println("This is the Thread of Runnable class.....");
        };
        Thread t2 = new Thread(r);
        t2.start();

    }
}
