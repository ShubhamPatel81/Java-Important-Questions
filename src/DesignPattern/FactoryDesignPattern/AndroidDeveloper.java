package src.DesignPattern.FactoryDesignPattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting Android Developer Salary");
        return 100000;
    }
}
