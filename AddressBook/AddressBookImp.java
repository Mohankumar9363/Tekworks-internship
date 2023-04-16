//Address Book: Create a class called AddressBook that stores a collection of contacts in a HashMap. The class should have methods to add, edit, and delete contacts, as well as to search for a contact by name.
import java.util.*;
class AddressBookImp implements AddressBookInterface
{
    Scanner sc=new Scanner(System.in);
    HashMap <String,AddressBookData> hm = new HashMap<>();
    public void add()
    {
        System.out.println("Enter no of contacts you want to add");
        String n=sc.nextLine();
        int num=Integer.parseInt(n);
        for(int i=0;i<num;i++)
            {
                System.out.println("Enter Address no");
                String adrnum=sc.nextLine();
                System.out.println("Enter Person name");
                String name=sc.nextLine();
                System.out.println("Enter House Number");
                String houseNum=sc.nextLine();
                System.out.println("Enter Street Name");
                String streetName=sc.nextLine();
                System.out.println("Enter Pin code");
                String pincode=sc.nextLine();
                hm.put(adrnum,(new AddressBookData (name,houseNum,streetName,pincode)));
            }
    }
    public void edit()
    {
        if(hm.size()==0)
           System.out.println("No Data is available to delete");
        else
       {
           System.out.println("Enter address number to edit details");
        String adrnum=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(adrnum.equals(k)){
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
        {
        System.out.println("Enter Person name");
        String name=sc.nextLine();
        System.out.println("Enter House Number");
        String houseNum=sc.nextLine();
        System.out.println("Enter Street Name");
        String streetName=sc.nextLine();
        System.out.println("Enter Pin code");
        String pincode=sc.nextLine();
        hm.replace(adrnum,new AddressBookData (name,houseNum,streetName,pincode));
        }
           else
            System.out.println("Not found");
        }
    }
    public void delete()
    {
       if(hm.size()==0)
           System.out.println("No Data is available to delete");
        else
       {
           System.out.println("Enter Address num to delete");
           String adrnum=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(adrnum.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
           hm.remove(adrnum);
        else 
            System.out.println("not found");
       }
    }
    public void search()
    {
        if(hm.size()==0)
           System.out.println("No Data is available to delete");
        else
       {
           System.out.println("Enter Address num to delete");
           String adrnum=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(adrnum.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
            System.out.println(hm.get(adrnum));
           else
            System.out.println("Not found");
        }      
    }
    public void display()
    {
        System.out.println(hm);
    }
}