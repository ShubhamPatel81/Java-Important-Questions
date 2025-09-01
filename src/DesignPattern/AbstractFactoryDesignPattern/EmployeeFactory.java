package src.DesignPattern.AbstractFactoryDesignPattern;

public class EmployeeFactory {

    // get employee
    public static  Employee getEmployee(AbstractEmployeeFactory factory){
            return factory.createEmployee();

    }
}
