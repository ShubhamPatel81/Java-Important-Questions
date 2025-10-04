package src.thread;

public class MainExample implements  Runnable{
    @Override
    public void run() {
        for (int x = 5; x < 10 ; x++ ){
            System.out.print(x);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MainExample());
        t.start();
        System.out.print("One");
        t.join();
        System.out.print("Two");
    }
}
