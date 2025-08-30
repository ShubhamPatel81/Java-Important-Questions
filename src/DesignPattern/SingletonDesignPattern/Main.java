package src.DesignPattern.SingletonDesignPattern;
// In singleton design pattern -> hm only ek hi baar object create karte hai aur pure project me kahi bhi use kr sakete hai

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
//        new Samosa();
        System.out.println("Lazy way of initialization singleton");
        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        // both hash code will be same means that only one object is created

        System.out.println("Eager way of creating singleton");
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());



        /*
           -- Way of breaking the singleton  design pattern
             1. Reflection API to break singleton pattern
             Solution -> i. If Object is there ==> thrown Exception (intside constructon)
                         ii. OR use ENUM
              2. Deserialization :
              solution -> implement readResolve() method

              3. Cloning (if we clone the object than also singleton pattern will be disrepute)

         */

        // this is using ENUM (for thread safety)
        System.out.println("Using ENUM Singleton class ");
        SamosaEnum samosaEnum = SamosaEnum.INSTANCE;
        System.out.println(samosaEnum.hashCode());
        samosaEnum.getTest();

        // Breaking using Reflection API
        System.out.println("Breaking using Reflection API");
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa samosa3 = constructor.newInstance();
//        System.out.println(samosa3.hashCode());

        // Breaking Singleton Pattern Using Deserialization
        System.out.println("Breaking Singleton Design Patter Using Serialization and Deserialization");
        Samosa samosa4= Samosa.getSamosa();
        System.out.println(samosa4.hashCode());
        // serialization
        // For Serialization implements "Serializable"
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(samosa4);
        System.out.println("Serialization done .....");
        // Deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa samosa5 =(Samosa) objectInputStream.readObject();
        System.out.println(samosa5.hashCode());

        System.out.println("Breaking Singleton Design Patter Using Cloning");
        Samosa samosa6 = (Samosa) samosa.clone();
        System.out.println(samosa6.hashCode());

    }
}
