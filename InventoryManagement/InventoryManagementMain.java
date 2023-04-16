import java.util.*;
class InventoryManagementMain
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            char ch;
           int choice; 
            InventoryManagementImp obj=new InventoryManagementImp();
            System.out.println("1.Add product");
            System.out.println("2.Edit product");
            System.out.println("3.Delete product");
            System.out.println("4.search product");
            System.out.println("5.Display products");
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
                        case 4:obj.check();
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