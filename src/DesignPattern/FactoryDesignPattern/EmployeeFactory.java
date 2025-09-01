package src.DesignPattern.FactoryDesignPattern;
// Also know as Factory Method Design pattern

// When there is a superClass and multiple subclass and we want to get Object of subclass based on input and requirement.
// Then we create factory class which takes the responsibility of creating object of class based on input.
// /----ADVANTAGES---
// 1. Focus on creating Object for Interface rather than implementation.
// 2. Loose coupling, more robust code.

// We create a static method and check , after without creating the object on Run Time you can input the value and run the code which will be loose coupling as we;;

// In this factory class method is used to hide the implementation provide loose coupling
public class EmployeeFactory {

    //get the employee
    public  static  Employee getEmployee(String employeeType){
        if (employeeType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if (employeeType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
                return new WebDeveloper();
        }else {
            return null;
        }
    }
}
