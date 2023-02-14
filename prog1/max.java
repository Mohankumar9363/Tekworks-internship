//Write a java program to find maximum between two numbers.
import java.util.Scanner;
class max
  {
    public static void main(String[] args)
    {
      int a,b;
      Scanner obj=new Scanner(System.in);
      a=obj.nextInt();
      b=obj.nextInt();
      if (a>b)
      System.out.println("a is greater");
      else 
        System.out.println("b is greater");
    }
  }