import java.util.Scanner;
class Product
  {
    public static void main(String args[])
    {
      String prod_name;
      double prod_price;
      double sell_price;
      Scanner ob=new Scanner(System.in);
        prod_name=ob.next();
        prod_price=ob.nextDouble();
      sell_price=prod_price*0.1+prod_price;
      System.out.println("sell_price"+sell_price);
    }
  }