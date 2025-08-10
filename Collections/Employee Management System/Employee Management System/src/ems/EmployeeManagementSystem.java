package ems;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class EmployeeManagementSystem {
    Map<Integer,Employee> employees = new HashMap<>();
    // add Employee
    public void addEmployee(Employee emp)
    {
        employees.put(emp.getEmployeeId(),emp);
    }
    public void removeEmployee(int empId)
    {
        employees.remove(empId);
    }
    public void displayAllEmployees(){
        employees.values().forEach(System.out::println);
    }
    public void displaySortedByName()
    {
        TreeSet<Employee> sortedSet = new TreeSet<>(employees.values());
        sortedSet.forEach(System.out::println);
    }
public void displaySortedbyAge()
{
    TreeSet<Employee> sortedAge = new TreeSet<>(new EmployeeAgeComparator());
    sortedAge.addAll(employees.values());
    sortedAge.forEach(System.out::println);
}

    public void displaySortedbySalary()
    {
        TreeSet<Employee> sortedAge = new TreeSet<>(new EmployeeSalaryComparator());
        sortedAge.addAll(employees.values());
        sortedAge.forEach(System.out::println);
    }

    public static void main(String[] args)
    {
     EmployeeManagementSystem ems = new EmployeeManagementSystem();
     Department department1 = new Department(1,"IT","Mumbai");
     Project project1 = new Project(100,"Banking App","Mumbai");
     department1.addProjects(project1);
        Employee e1 = new Employee(101, "John", "Doe", "M", "Delhi", 30, 50000, "9876543210",
                LocalDate.of(2020, 5, 10), department1);

        Employee e2 = new Employee(102, "Alice", "Smith", "F", "Pune", 28, 60000, "9123456780",
                LocalDate.of(2021, 3, 15), department1);

        Employee e3 = new Employee(103, "Bob", "Taylor", "M", "Chennai", 32, 45000, "9898989898",
                LocalDate.of(2019, 8, 21), department1);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("display All Employees");
        ems.displayAllEmployees();

        System.out.println("Sorted By Name");
        ems.displaySortedByName();

        System.out.println("Sorted By Age");
        ems.displaySortedbyAge();

        System.out.println("Sorted By Salary");
        ems.displaySortedbySalary();

    }
}
