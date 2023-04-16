/*Employee Management: Create a class called Employee that represents an employee and a class called Company that represents a company. The company class should have methods to add, remove, and display employees. You can also create a custom exception called InvalidSalaryException to throw when an employee's salary is below the minimum wage.*/
import java.util.Scanner;

 class Employee {
    String employee_name;
     double salary;
     Employee(String employee_name,double salary){
         this.employee_name=employee_name;
         this.salary=salary;
     }
     void getEmployeeDetails() {
        System.out.println("employee name is "+employee_name);
         try{
             if(salary>1000000)
                    System.out.println("salary of employee is "+salary);
             else{
                 throw new Exception();
             }
         }
         catch(Exception e){
             System.out.println("InvalidSalaryException");
         }
    }
}
 class Company {
    String[] employees;
     Company(String[] employees){
         this.employees=employees;
     }
     void addEmployee( ){
         System.out.println("enter employees name to add in Company");
         Scanner sc=new Scanner(System.in);
         String emp=sc.nextLine();
         String employees1[]=new String[employees.length+1];
         for(int i=0;i<employees.length;i++)
             employees1[i]=employees[i];
         employees1[employees.length]=emp;
         this.employees=employees1;
     }
     void deleteEmployee(){
         System.out.println("enter employee name to delete in Company");
         Scanner sc=new Scanner(System.in);
         String emp=sc.nextLine();
         String employees1[]=new String[employees.length-1];
         int j=0;
         for(int i=0;i<employees.length;i++){
             if(!employees[i].equals(emp)){
                 employees1[j++]=employees[i];
             }    
         }
         this.employees=employees1;
     }
    void displayEmployees() {
        System.out.println("the employees in company are:");
        for(String h:employees)
            System.out.println(h);
    }
    
} 
class EmployeeManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter details for employee");
        System.out.println("enter employee name:");
        String employee_name=sc.nextLine();
        System.out.println("enter salary of employee ");
        double salary=sc.nextDouble();
        System.out.println("enter details for Company");
        System.out.print("Enter the number of employee's: ");
        int n = sc.nextInt();
        String[] employees = new String[n];
        System.out.println("enter employee names");
        for (int i = 0; i < n; i++) {
            employees[i] = sc.nextLine();
        }
        Employee p = new Employee(employee_name,salary);
        Company s=new Company(employees);
        int opt=0;
        System.out.println("choose the option from below");
        System.out.println("1.Employee details "+"2.Add Employee "+"3.Delete Employee "+"4.Display Employee's "+"5.Exit");
        while(opt!=5){ 
        opt=sc.nextInt();
        switch(opt){
            case 1:p.getEmployeeDetails();
                break;
            case 2: s.addEmployee();
                break;
            case 3: s.deleteEmployee();
                break;
            case 4: s.displayEmployees();
                break;
        }
            if(opt!=5)
            System.out.println("select another option");
    }
    }}