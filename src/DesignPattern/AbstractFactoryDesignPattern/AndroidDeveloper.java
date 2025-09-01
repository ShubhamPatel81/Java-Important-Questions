package src.DesignPattern.AbstractFactoryDesignPattern;

import src.DesignPattern.AbstractFactoryDesignPattern.Employee;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer Salary: ");
        return 100000;
    }

    @Override
    public String name() {
//        System.out.println();
        return "I'm Android Developer";
    }
}
