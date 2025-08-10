package ems;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    private Map<Integer, Employee> employees = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    // ---------------- ADD EMPLOYEE ----------------
    public void addEmployee() {
        System.out.println("\nEnter Employee Details:");

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Sex (M/F): ");
        String sex = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Date of Joining (yyyy-MM-dd): ");
        String dojInput = sc.nextLine();
        LocalDate doj = LocalDate.parse(dojInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println("\n--- Enter Department Details ---");
        System.out.print("Department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();

        System.out.print("Department Name: ");
        String deptName = sc.nextLine();

        System.out.print("Department Location: ");
        String deptLocation = sc.nextLine();

        Department department = new Department(deptId, deptName, deptLocation);

        Employee emp = new Employee(id, firstName, lastName, sex, address, age, salary, contact, doj, department);
        employees.put(id, emp);

        System.out.println("Employee Added Successfully!");
    }

    // ---------------- REMOVE EMPLOYEE ----------------
    public void removeEmployee() {
        System.out.print("Enter Employee ID to Remove: ");
        int empId = sc.nextInt();
        if (employees.remove(empId) != null) {
            System.out.println("Employee Removed Successfully!");
        } else {
            System.out.println("Employee with ID " + empId + " not found!");
        }
    }

    // ---------------- DISPLAY ALL EMPLOYEES ----------------
    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        employees.values().forEach(System.out::println);
    }

    // ---------------- SORT BY NAME ----------------
    public void displaySortedByName() {
        TreeSet<Employee> sortedSet = new TreeSet<>(employees.values());
        sortedSet.forEach(System.out::println);
    }

    // ---------------- SORT BY AGE ----------------
    public void displaySortedByAge() {
        TreeSet<Employee> sortedSet = new TreeSet<>(new EmployeeAgeComparator());
        sortedSet.addAll(employees.values());
        sortedSet.forEach(System.out::println);
    }

    // ---------------- SORT BY SALARY ----------------
    public void displaySortedBySalary() {
        TreeSet<Employee> sortedSet = new TreeSet<>(new EmployeeSalaryComparator());
        sortedSet.addAll(employees.values());
        sortedSet.forEach(System.out::println);
    }

    // ---------------- ADD PROJECT TO DEPARTMENT ----------------
    public void addProjectToDepartment() {
        System.out.print("Enter Employee ID to Add Project: ");
        int empId = sc.nextInt();
        sc.nextLine();

        Employee emp = employees.get(empId);
        if (emp == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("--- Project Details ---");
        System.out.print("Project ID: ");
        int projId = sc.nextInt();
        sc.nextLine();

        System.out.print("Project Name: ");
        String projName = sc.nextLine();

        System.out.print("Project Location: ");
        String projLocation = sc.nextLine();

        Project proj = new Project(projId, projName, projLocation);
        emp.getDepartment().addProjects(proj);

        System.out.println("Project added to " + emp.getDepartment().getDepartmentName()+ " department.");
    }

    // ---------------- MAIN MENU ----------------
    public void start() {
        int choice;
        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Sort by Name");
            System.out.println("5. Sort by Age");
            System.out.println("6. Sort by Salary");
            System.out.println("7. Add Project to Department");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> removeEmployee();
                case 3 -> displayAllEmployees();
                case 4 -> displaySortedByName();
                case 5 -> displaySortedByAge();
                case 6 -> displaySortedBySalary();
                case 7 -> addProjectToDepartment();
                case 0 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        Main system = new Main();
        system.start();
    }
}
