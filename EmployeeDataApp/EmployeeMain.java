import java.util.*;
class EmployeeMain
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            char ch;
           int choice; 
            EmployeeImp empobj=new EmployeeImp();
            System.out.println("1.Add Employee Details");
                        System.out.println("2.Delete Employee Details");
                        System.out.println("3.search Employee Details");
                        System.out.println("4.Display Employee Details");
            
            do{
                System.out.println("Enter your choice");
                choice=sc.nextInt();
                switch(choice)
                    {
                        case 1:empobj.insert();
                            break;
                        case 2:empobj.delete();
                            break;
                        case 3:empobj.search();
                            break;
                        case 4:empobj.display();
                            break;
                            default :System.out.println("Invalid Option");
                            break;
                    }
                System.out.println("Do tou want to continue one more Operation(y/n");
                ch=sc.next().charAt(0);
            }while(ch!='n');
        }
    }