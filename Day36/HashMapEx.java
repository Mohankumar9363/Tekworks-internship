import java.util.*;
public class HashMapEx
{
    public static void main (String a[])
    {
        HashMap <  String,Price > hm = new HashMap < > ();
        hm.put ( "first object",new Price ("Banana", 20));
        hm.put ( "Second object",new Price ("Apple", 40));
        hm.put ("Third object",new Price ("Orange", 30) );
        
        for (Map.Entry u: hm.entrySet())
        {
            System.out.println (u.getKey()+ "  " +u.getValue());
        }
        ArrayList<Price>al=new ArrayList<Price>(hm.values());
        System.out.println(al);
    }
}
class Price
{
    private String item;
    private int price;
    public Price (String itm, int pr)
    {
        this.item = itm;
        this.price = pr;
    }
    
    public String getItem ()
    {
        return item;
    }
    
    public int getPrice ()
    {
        return price;
    }
    
    public String toString ()
    {
        return "item: " + item + "  price: " + price;
    }
}