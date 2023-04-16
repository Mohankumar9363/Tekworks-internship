 /*Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.*/
import java.util.*;
class Shape{
 
}
 class Rectangle extends Shape{
  double length1;
  double breadth1;
  double length2;
  double breadth2;
  Rectangle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length1 of rectangle");
    length1=sc.nextDouble();
    System.out.println("enter the breadth1 of rectangle");
    breadth1=sc.nextDouble();
    System.out.println("enter the length2 of rectangle");
    length2=sc.nextDouble();
    System.out.println("enter the breadth2 of rectangle");
    breadth2=sc.nextDouble();  
  }
    void area(){
      try{
      if(length1==length2&&breadth1==breadth2)
        System.out.println("the area of rectangle is"+(length1*breadth1));
      else
          throw new Exception();
      }
      catch(Exception e){
          System.out.println("invalid dimensions for area of rectangle");
      }
  }
 void perimeter(){
        try{
         if(length1==length2&&breadth1==breadth2)
             System.out.println("perimeter of rectangle is "+(2*(length1+breadth1)));
            else
          throw new Exception();
      }
      catch(Exception e){
          System.out.println("invalid dimensions for perimeter of rectangle");
        }
        
    }
}
class Triangle extends Shape{
  double height;
  double base;
  double side1;
  double side2;
  Triangle(){
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the height of Triangle");
    height=sc.nextDouble();
    System.out.println("enter the base of Triangle");
    base=sc.nextDouble(); 
    System.out.println("enter the side1 of Triangle");
    side1=sc.nextDouble(); 
    System.out.println("enter the side2 of Triangle");
    side2=sc.nextDouble(); 
  }
   void area(){
      try{
      if((base+side1)>side2)
    System.out.println("the area of Triangle is"+(height*base)/2);
      else
      throw new Exception();
  }
  catch(Exception e){
      System.out.println("invalid dimensions for area of triangle");
    }
        
}
     void perimeter(){
      try{
      if((base+side1)>side2)
    System.out.println("the perimeter of Triangle is"+(base+side1+side2));
      else
      throw new Exception();
  }
  catch(Exception e){
      System.out.println("invalid dimensions for perimeter of triangle");
    }
        
}
}
class Circle extends Shape{
  double radius;
  Circle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius of Circle");
    radius=sc.nextDouble();
  }
   void area(){
      try{
      if(radius>0)
    System.out.println("the area of Circle is"+(3.14*radius*radius));
     else
      throw new Exception();
  }
  catch(Exception e){
      System.out.println("invalid dimensions for area of circle");
    }
}
     void perimeter(){
      try{
      if(radius>0)
    System.out.println("the area of Circle is"+(2*3.14*radius));
     else
      throw new Exception();
  }
  catch(Exception e){
      System.out.println("invalid dimensions for perimeter of circle");
    }
}
}

class ShapesException{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
    Shape ob1=new Shape();
      int option=0;
    do{
    System.out.println("choose the option from below ");
    System.out.println("1.Area and Perimeter of Rectangle "+"2.Area and Perimeter of Triangle "+"3.Area and Perimeter of circle "+"4.exit");
    option=sc.nextInt();
    switch(option){
        case 1:
            {
                Rectangle ob2=new Rectangle();
                ob2.area();
                ob2.perimeter();
                break;
            }
        case 2:
            {
                Triangle ob3=new Triangle();
                ob3.area();
                ob3.perimeter();
                break;
            }
        case 3:
            {
                Circle ob4=new Circle();    
                ob4.area();
                ob4.perimeter();
                break;
            }
    }
  }while(option!=4);
  }
}