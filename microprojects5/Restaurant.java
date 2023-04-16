//Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost
import java.util.*;
class Dish{
  String name;
  double price;
  String ingredients[];
  void setdetails()
  {
  Scanner sc=new Scanner(System.in);
   System.out.println("enter Dish Name");
    name=sc.nextLine();
    System.out.println("enter no of ingredients");
    int n=sc.nextInt();
    ingredients=new String[n];
    System.out.println("enter ingredients");
    for(int i=0;i<n;i++)
      ingredients[i]=sc.nextLine();
   System.out.println("enter the price of dish");
   price=sc.nextDouble();
  }
  void getName(){
    System.out.println("Dish name is:"+" "+name);
  }
void getIngredients(){
  System.out.println("the ingredients are:");
  for(String h:ingredients)
    System.out.println(h);
}
void getPrice(){
  System.out.println("the price of dish is "+" "+price);
}
}
class Restaurant{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of dishes");
      int num=sc.nextInt();
    Dish ob[]=new Dish[num];
      for(int j=0;j<num;j++){
        ob[j]=new Dish();
        ob[j].setdetails();
        ob[j].getName();
        ob[j].getIngredients();
        ob[j].getPrice();
  }}
}