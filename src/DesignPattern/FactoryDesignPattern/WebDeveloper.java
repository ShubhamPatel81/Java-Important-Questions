package src.DesignPattern.FactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting Web developer Salary");
        return 80000;
    }
}
