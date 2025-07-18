package src.thread;



import java.io.InterruptedIOException;

class SharedResource  {
    private  volatile boolean flag= false;
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean getFlag() {
        return flag;
    }
}
public class Valid_KeyWord {

    public static void main(String[] args) throws Exception {
        SharedResource sharedResource = new SharedResource();

        //Thread 1
        new Thread( ()->{
            System.out.println("Thread 1 Started");
            try
            {
                System.out.println("Thread 1 logic started");
                Thread.sleep(1000);
                System.out.println("Thread 1 logic completed");
                sharedResource.setFlag(true);
                System.out.println("Flag get by Thread 1");


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        //Second Thread 2
        new Thread(()->{
            System.out.println("Thread 2 Started");
            while (!sharedResource.getFlag()){
// This infinite loop is controlled by using "volatile" while declaring the flag or variables
            }
            System.out.println("Thread 2 logic completed ");
        }).start();


    }
}
