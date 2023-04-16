//Inventory Management: Create a class called InventoryManagement that stores a collection of products in a HashMap. The class should have methods to add, edit, and delete products, as well as to check the availability of a product and display the products that are out of stock.
import java.util.*;
class InventoryManagementImp implements InventoryManagementInterface
{
    Scanner sc=new Scanner(System.in);
    HashMap <String,String> hm = new HashMap<>();
    public void add()
    {
        System.out.println("Enter no of products you want to add");
        String n=sc.nextLine();
        int num=Integer.parseInt(n);
        for(int i=0;i<num;i++)
            {
                System.out.println("Enter product no");
                String pnum=sc.nextLine();
                System.out.println("Enter product name");
                String name=sc.nextLine();
                hm.put(pnum,name);
            }
    }
    public void edit()
    {
        if(hm.size()==0)
           System.out.println("No Data is available to edit");
        else
       {
           System.out.println("Enter product number to edit details");
        String pnum=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(pnum.equals(k)){
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
        {
        System.out.println("Enter product name");
        String name=sc.nextLine();
        hm.replace(pnum,name);
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
           System.out.println("Enter product num to delete");
           String pnum=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(pnum.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
           hm.remove(pnum);
        else 
            System.out.println("not found");
       }
    }
    public void check()
    {
        if(hm.size()==0)
           System.out.println("No Data is available to search");
        else
       {
           System.out.println("Enter product num to search");
           String pnum=sc.nextLine();
           String verify=null;
           for(String k:hm.keySet())
               {
                 if(pnum.equals(k))
                 {
                     verify="found";
                   break;
                 }
               }
        if(verify!=null)
            System.out.println(hm.get(pnum));
           else
            System.out.println("Not found");
        }      
    }
    public void display()
    {
        System.out.println(hm);
    }
}