import java.util.*;
 
class ArithmeticOp {
  public static void main(String al[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any two numbers to perform arithmetc operations");
    int number1 = s.nextInt();
    int number2 = s.nextInt();
    System.out.println(addition(number1,number2));
    System.out.println(substraction());
    multiplication(number1,number2);
    division( );    
  }
static int  addition(int num1,int num2)
  {
    return num1+num2;
  }
  static int substraction()
  {
    int a=10;
    int b=5;
    return a-b;
  }
  static void multiplication(int number1,int number2)
  {
        int c= number1*number2;
    System.out.println(c);
  }

  static void division( )
  {
    double d=10.0;
    double e=5.0;
    double f=d/e;
    System.out.println(f);
  }
}