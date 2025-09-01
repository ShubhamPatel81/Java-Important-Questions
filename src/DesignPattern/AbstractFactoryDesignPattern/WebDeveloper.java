package src.DesignPattern.AbstractFactoryDesignPattern;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Web Developer Salary: ");
       return  90000;
    }

    @Override
    public String name() {
        return "I'm Web Developer";
    }
}
