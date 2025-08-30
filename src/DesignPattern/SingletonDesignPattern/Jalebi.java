package src.DesignPattern.SingletonDesignPattern;

public class Jalebi {

    // Eager(Eager Initialization) way if creating singleton
    // Eager way me static variable sabse pahale initialize ho jate hai
    private static Jalebi jalebi = new Jalebi();
    private Jalebi(){}
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
