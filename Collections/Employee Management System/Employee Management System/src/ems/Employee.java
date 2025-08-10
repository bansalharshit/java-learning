package ems;

import java.time.LocalDate;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String sex;
    private String address;
    private int age;
    private double salary;
    private String contacts;
    private LocalDate dateOfJoining;
    private Department department;
    private List<EmployeeWorkOn> projects;

    public Employee(int employeeId, String firstName, String lastName, String sex, String address, int age, double salary, String contacts, LocalDate dateOfJoining, Department department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.contacts = contacts;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment()
    {
        return department;
    }
    @Override
    public int compareTo(Employee other) {
        return this.firstName.compareToIgnoreCase(other.firstName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department=" + department.getDepartmentName() +
                '}';
    }
}
