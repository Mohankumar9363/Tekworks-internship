import java.util.*;
class AddressBookMain
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            char ch;
           int choice; 
            AddressBookImp obj=new AddressBookImp();
            System.out.println("1.Add Contact Details");
            System.out.println("2.Edit Contact Details");
            System.out.println("3.Delete Contact Details");
            System.out.println("4.search Contact Details");
            System.out.println("5.Display Contact Details");
            do{
                System.out.println("Enter your choice");
                choice=sc.nextInt();
                switch(choice)
                    {
                        case 1:obj.add();
                            break;
                        case 2:obj.edit();
                            break;
                        case 3:obj.delete();
                            break;
                        case 4:obj.search();
                            break;
                        case 5:obj.display();
                            break;
                        default :System.out.println("Invalid Option");
                            break;
                    }
                System.out.println("Do tou want to continue one more Operation(y/n)");
                ch=sc.next().charAt(0);
            }while(ch!='n');
        }
    }