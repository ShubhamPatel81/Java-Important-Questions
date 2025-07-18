package src.thread;

public class ThreadClassUsingRunnable implements Runnable{
    public void run(){

        //thread task
        for (int i = 1; i<= 20 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i = "+i);
        }

    }
}
