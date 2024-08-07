package com.luv4code.streams;

import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployeeList() {
        Employee emp1 = new Employee(1, "Alice Johnson", "Engineering", 75000.00);
        Employee emp2 = new Employee(2, "Bob Smith", "Marketing", 65000.00);
        Employee emp3 = new Employee(3, "Charlie Brown", "Engineering", 60000.00);
        Employee emp4 = new Employee(4, "Diana Prince", "Finance", 80000.00);
        Employee emp5 = new Employee(5, "Ethan Hunt", "Engineering", 70000.00);
        return List.of(emp1, emp2, emp3, emp4, emp5);
    }

}
