package src.DesignPattern.SingletonDesignPattern;


import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;

// In singleton design pattern -> hm only ek hi baar object create karte hai aur pure project me kahi bhi use kr sakete hai
public class Samosa  implements Serializable,Cloneable {

    private static Samosa samosa;
    //constructor
    // kb bhi singleton design pattern use kr rhe ho to constructor hamesa private hi banana hai
    private Samosa(){
        if (samosa!=null){
            throw new RuntimeException("You Are trying to breck Singleton pattern");
        }

    }

    // Lazy (Lazy initialization )way of creating single object
    // Isme hm thread ke dhyan hi nhi diya hai
    // If multiple thread is code ko execute kr rhe hai to problem hoga (kyuki threads are concurrent (means all thread execute at same time))
    // To create this thread safe use "synchronized" keyword
    public  static  Samosa getSamosa(){
        // object of this class
//      Samosa samosa =  new Samosa(); // jb bhi koi ise call karega to ye line hamesa chal jayega to isse ek hi baar chalane ke liye hm variable (Samosa samosa ) create karnege
        if (samosa ==null){
            // We have to synchronized only this otherwise if we synchronized full method then it will take time for executing other thread beacuse may be other code of this method are executing
          synchronized (Samosa.class){
              if (samosa==null){
                  samosa=new Samosa();
              }
            }
        }
        return samosa;
    }
    // implement the readResolve method to resolve the Serialization and Deserialization
    private Object readResolve() throws ObjectStreamException {
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return samosa;
    }

}

// Using enum just create and it will be thread safe
 enum SamosaEnum{

    INSTANCE;
    public  void getTest(){
        System.out.println("Testing inside the ENUM");
    }
}
/*
1. Constructor private
2.  Object create with the help of method
3. Create field to store object is private


 */