import java.util.*;
class EmployeeImp implements EmployeeInterface
    {
        ArrayList<Employee> emparr=new ArrayList<>();
        public void insert()
        {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Details");
        System.out.println("Enter Employee Name");
        String name=sc.nextLine();
        System.out.println("Enter Employee id");
        int id=sc.nextInt();
        System.out.println("Enter Employee Salary");
        double salary=sc.nextDouble();
            emparr.add(new Employee(name,id,salary));
        }
        public void delete()
        {
            Scanner sc=new Scanner(System.in);
            if(emparr.size()==0)
                System.out.println("No Data Is Available to Delete");
            else
            {
                String verify=null;
                System.out.println("Enter Employee Id to Delete Data");
             int empid=sc.nextInt();
                for(Employee e:emparr)
                    {
                        if(e.getId()==empid)
                            {               
                             emparr.remove(e);
                            verify="found";
                                break;  
                            }
                    }
                if(verify==null)
                {
                    System.out.println("Not Found");
                }
            }
        }
        public void search()
        {
            Scanner sc=new Scanner(System.in);
            if(emparr.size()==0)
                System.out.println("No Data Is Available to Delete");
            else
            {
                String verify=null;
                System.out.println("Enter Employee Id to search Data");
             int empid=sc.nextInt();
                for(Employee e:emparr)
                    {
                        if(e.getId()==empid)
                            {               
                             System.out.println(e.toString());
                            verify="found";
                                break;  
                            }
                    }
                if(verify==null)
                {
                    System.out.println("Not Found");
                }
            }
        }
        public void display()
        {
            if(emparr.size()==0)
                System.out.println("No Data Is Available");
            else
            {
          Iterator it=emparr.iterator();
            while(it.hasNext())
                {
                    System.out.println(it.next());
                }
            }
        }
        void add1()
        {
            System.out.println("yes its working");
        }
    }