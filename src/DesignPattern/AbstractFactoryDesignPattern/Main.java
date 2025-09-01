package src.DesignPattern.AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        // For Android developer
      Employee employee =  EmployeeFactory.getEmployee(new AndroidDevelopmentFactory());
        System.out.println(employee.salary());
        System.out.println(employee.name());

        Employee employee1 = EmployeeFactory.getEmployee(new WebDevelopmentFactory());
        System.out.println(employee1.name());
        System.out.println(employee1.salary());
    }
}
