package src.Java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary + '}';
    }
}
public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "IT",70000),
                new Employee("Neha","HR",50000),
                new Employee("Ravi","IT",80000),
                new Employee("Priya","DEV",60000),
                new Employee("Raj", "HR" ,55000)
        );
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
