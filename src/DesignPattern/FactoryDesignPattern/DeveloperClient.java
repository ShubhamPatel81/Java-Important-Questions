package src.DesignPattern.FactoryDesignPattern;

// When there is a superClass and multiple subclass and we want to get Object of subclass based on input and requirement.
// Then we create factory class which takes the responsibility of creating object of class based on input.
// /----ADVANTAGES---
// 1. Focus on creating Object for Interface rather than implementation.
// 2. Loose coupling, more robust code.

// We create a static method and check , after without creating the object on Run Time you can input the value and run the code which will be loose coupling as we;;


public class DeveloperClient {
    public static void main(String[] args) {
//        Employee employee = new AndroidDeveloper();
      Employee employee=  EmployeeFactory.getEmployee("ANDROID DEVELOPER");
       int salary = employee.salary();
        System.out.println("Salary: "+salary);

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salaryW =employee1.salary();
        System.out.println("Salary : "+salaryW);
    }
}
