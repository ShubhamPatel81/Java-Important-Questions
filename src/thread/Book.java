package src.thread;

public class Book implements Runnable{

    @Override
    public void run() {
        for (int a =3; a < 7; a++){
            System.out.print(a);
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Book());
        t.start();
        System.out.print("AA");
        t.join();
        System.out.print("BB");
    }
}
