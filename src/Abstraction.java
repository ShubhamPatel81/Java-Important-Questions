package src ;

abstract  class  ATM{
    int pin;
    String  DEBIT;
    int money;
    abstract void hello();
}

class  AbstarctImpl extends  ATM{


    void hello() {
        money = 100;
        System.out.println(money);
    }
}
public class Abstraction {
    public static void main(String[] args) {
        AbstarctImpl s = new AbstarctImpl();
       s.hello();

    }
}
