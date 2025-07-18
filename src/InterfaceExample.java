package src;

interface AtmMoney{

        abstract void Hello(int money);
        default void  hii(){
            System.out.println("Money is withdrawl!!!!!");
        }


}
class S implements  AtmMoney{


    public void Hello(int money) {
        System.out.println(money);
    }

}
public class InterfaceExample {
    public static void main(String[] args) {
        S ss = new S();
        ss.Hello(999);
        ss.hii();
    }
}
