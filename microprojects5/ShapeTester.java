/*Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.*/
import java.util.*;
class Shape{
  String color;
  void area(){
    
  }
}
class Rectangle extends Shape{
  double length;
  double breadth;
  Rectangle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the color of shape Rectangle");
    color =sc.nextLine();
    System.out.println("the color of shape Rectangleis "+" "+color);
    System.out.println("enter the length of rectangle");
    length=sc.nextDouble();
    System.out.println("enter the breadth of rectangle");
    breadth=sc.nextDouble();
  }
  void area(){
    System.out.println("the area of rectangle is"+(length*breadth));
  }
}
class Triangle extends Shape{
  double height;
  double base;
  Triangle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the color of shape Triangle");
    color =sc.nextLine();
    System.out.println("the color of shape Triangle is "+" "+color);
    System.out.println("enter the height of Triangle");
    height=sc.nextDouble();
    System.out.println("enter the base of Triangle");
    base=sc.nextDouble(); 
  }
  void area(){
    System.out.println("the area of Triangle is"+(height*base)/2);
}
}
class Circle extends Shape{
  double radius;
  Circle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the color of shape Circle");
    color =sc.nextLine();
    System.out.println("the color of shape Circle is "+" "+color);
    System.out.println("enter the radius of Circle");
    radius=sc.nextDouble();
  }
  void area(){
    System.out.println("the area of Circle is"+(3.14*radius*radius));
}}
class ShapeTester{
  public static void main(String args[]){
    Shape ob1=new Shape();
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rectangles");
      int num=sc.nextInt();
    Rectangle ob2[]=new Rectangle[num];
      for(int i=0;i<num;i++){
          ob2[i]=new Rectangle();
          ob2[i].area();
      }
      System.out.println("enter no of Triangles");
      int num1=sc.nextInt();
    Triangle ob3[]=new Triangle[num1];
      for(int i=0;i<num1;i++){
          ob3[i]=new Triangle();
          ob3[i].area();
      }
      System.out.println("enter no of Circles");
      int num2=sc.nextInt();
Circle ob4[]=new Circle[num2];
      for(int i=0;i<num2;i++){
    ob4[i]=new Circle();    
    ob4[i].area();
      }
  }
}