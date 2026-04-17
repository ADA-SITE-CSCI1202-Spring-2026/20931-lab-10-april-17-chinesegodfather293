package mapping;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Smith", 75000));
        employees.add(new Employee("Jane", "Doe", 85000));
        employees.add(new Employee("Bob", "Johnson", 65000));
        employees.add(new Employee("Alice", "Williams", 95000));
        
        Function<Employee, String> formatCard = e -> "Name: [" + e.getLastName() + ", " + e.getFirstName() + "] - Salary: $" + e.getSalary();
        
        Function<Employee, Double> salaryPicker = Employee::getSalary;
        
        System.out.println("Employee Cards:");
        for (Employee emp : employees) {
            System.out.println(formatCard.apply(emp));
        }
        
        System.out.println("\nEmployee Salaries:");
        for (Employee emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + ": $" + salaryPicker.apply(emp));
        }
    }
}
