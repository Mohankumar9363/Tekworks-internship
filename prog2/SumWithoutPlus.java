import java.util.Scanner;
class SumWithoutPlus
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter Two numbers");
      double a=s.nextDouble();
      double b=s.nextDouble();
      double sum= a-(-b);
      System.out.println("sum of two numbers is"+ " "+ sum);
    }
  }