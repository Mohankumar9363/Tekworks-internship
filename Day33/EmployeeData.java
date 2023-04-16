import java.util.*;

class Employee1 {
    String name;
    int id;
    int age;
    double salary;

    Employee1(String name, int id, int age, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + "]";
    }
}

class EmployeeData {
    public static void main(String rags[]) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Employee1>employeeList=new ArrayList<>();
        employeeList.add(new Employee1("john",101,20,234566)); 
        employeeList.add(new Employee1("jane",102,30,334566)); 
        employeeList.add(new Employee1("Bob",103,40,434566));  
        Iterator it=employeeList.iterator();
        while(it.hasNext())
            {  
                System.out.println(it.next());
            }
        String verify=null;  
        System.out.println("Enter employee id to get employee details");
        int sid=sc.nextInt();
        for(Employee1 e:employeeList)
            {
                if(e.getId()==(sid)){
                    System.out.println(e.toString());
                    verify="found";
                    break;
                }
            }
        if(verify==null)
            System.out.println("Not Found");

        String verify2=null;  
        System.out.println("Enter employee id to remove employee details");
        int sid2=sc.nextInt();
        for(Employee1 e:employeeList)
            {
                if(e.getId()==sid2){
                   employeeList.remove(e);
                    verify2="found";
                    break;
                }
            }
        if(verify2==null)
            System.out.println("Not Found");
        Iterator itr=employeeList.iterator();
        while(itr.hasNext())
            {
                System.out.println(itr.next());
               
            }
    }
}