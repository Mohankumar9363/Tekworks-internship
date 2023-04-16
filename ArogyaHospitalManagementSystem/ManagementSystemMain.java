import java.util.Scanner;
public class ManagementSystemMain {

	public static void main(String[] args) 
		{
		    Scanner sc=new Scanner(System.in);
		    char ch;
		   int choice; 
		    ManagementSystemImp obj=new ManagementSystemImp();
		    System.out.println("1.Add New Patient");
		    System.out.println("2.View All Patient Details");
		    System.out.println("3.search by patient id");
	        System.out.println("4.search by patient name");
	        System.out.println("5.search by patient city");
	        System.out.println("6.search by age(Enter min age and max age");
	        System.out.println("7.Mark Patient as Recovered");
		do{
		    System.out.println("Enter your choice");
		    choice=sc.nextInt();
		    switch(choice)
		        {
		        case 1:obj.addPatient();
		            break;
		        case 2:obj.view();
		            break;
                case 3:obj.searchById();
                    break;
                case 4:obj.searchByName();
                    break;
                case 5:obj.searchByCity();
                    break;
                case 6:obj.searchByAge();
                    break;
		        case 7:obj.recovery();
		            break;
		        default :System.out.println("Invalid Option");
		            break;
		         }
		        System.out.println("Do tou want to continue one more Operation(y/n)");
		        ch=sc.next().charAt(0);
		   }while(ch!='n');
		}
	}


