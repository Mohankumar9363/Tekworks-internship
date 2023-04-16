import java.util.ArrayList;
class Employee {
    private String name;
    private int age;
     double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}

public class EmployeeDatabase {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        
        // Add employees to the database
        employees.add(new Employee("John Doe", 30, 50000.0));
        employees.add(new Employee("Jane Smith", 25, 40000.0));
        employees.add(new Employee("Bob Johnson", 35, 60000.0));
        
        // Print all employees in the database
        System.out.println("All employees:");
        System.out.println(employees.toString());
        
        // Remove an employee from the database
        employees.remove(1); // Remove Jane Smith
        
        // Print all employees in the database after removing an employee
        System.out.println("All employees after removing an employee:");
        System.out.println(employees.toString());
        
        // Update an employee's salary in the database
        Employee johnDoe = employees.get(0);
        johnDoe.salary = 55000.0; // Give John Doe a raise
        
        // Print all employees in the database after updating an employee's salary
        System.out.println("All employees after updating an employee's salary:");
        System.out.println(employees.toString());
    }
}
