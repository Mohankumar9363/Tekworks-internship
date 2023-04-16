import java.util.*;
class ConstructorExample{
  int num1;
  int num2;
  /*no argument constructor definition
  ConstructorExample(){
    
  }*/
  //parameterised constructor definition
  ConstructorExample(String str){
    
  }
  void getNum1()
  {
    System.out.println(num1);
  }
  void getNum2()
  {
    System.out.println(num2);
  }
  void setNum1()
  {
    Scanner sc=new Scanner(System.in);
    num1=sc.nextInt();
  }
  void setNum2()
  {
    Scanner sc=new Scanner(System.in);
    num2=sc.nextInt();
  }
}
class ConstructorMain
  {
    public static void main(String args[]){
      ConstructorExample ce=new ConstructorExample("hello");
      ce.setNum1();
      ce.setNum2();
      ce.getNum1();
      ce.getNum2();
    }
  }