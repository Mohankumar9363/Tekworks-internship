//Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost
import java.util.*;
class product{
  String name;
  double price;
  double quantity;
  void setdetails()
  {
    System.out.println("enter the details");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the name of product");
    name=sc.nextLine();
    System.out.println("enter the price of product");
    price=sc.nextDouble();
    System.out.println("enter the quantity of product");
    quantity=sc.nextDouble();   
  }
  void getName(){
    System.out.println("the name of product is"+" "+name);
  }
  void getPrice(){
    System.out.println("the price of product is"+" "+price);
  }
  void getQuantity(){
    System.out.println("the quantity of product is"+" "+quantity);
  }
}
class PointOfSaleSystem{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of customers");
    int num=sc.nextInt();
    product p[]=new product[num];
      for(int i=0;i<num;i++){
        p[i]=new product();     
        p[i].setdetails();
        p[i].getName();
        p[i].getPrice();
        p[i].getQuantity();
  }}
}