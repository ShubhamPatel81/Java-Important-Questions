package src.thread;

public class ThreadUsingThreadClass extends Thread{
    public void run(){
        //tASK

        for (int i =1 ; i<=10;i++){

            System.out.println(i*5);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
