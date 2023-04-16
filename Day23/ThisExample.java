import java.util.*;
class ConstructorExample {
  int num1;
  int num2;
  ConstructorExample(int num1,int num2)
  {
    this.num1 = num1;
    this.num2 = num2;   
    // this current invoking object
  }
  void getNum1(int num1) {
    this.num1=num1;
    System.out.println(num1);
  }
  void getNum2() {
    System.out.println(num2);
  }
}
 
class ThisExample {
  public static void main(String l[]) {
    ConstructorExample ce1 = new ConstructorExample(45, 9);  
      ConstructorExample ce2= new ConstructorExample(4, 93);  
    ce1.getNum1(300);
    ce2.getNum1(450);
  }
}