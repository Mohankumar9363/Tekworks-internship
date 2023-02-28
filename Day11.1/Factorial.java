//Write a java program to calculate factorial of a number
import java.util.Scanner;
class Factorial
  {
    public static void main(String[] args){
      int fact=1;
      Scanner s=new Scanner(System.in);
      System.out.print("enter any num : ");
      int num=s.nextInt();
      Factorial.displayFactorial(num,fact);
    }
    public static void  displayFactorial(int num,int fact)
    {
      for(int i=1;i<=num;i++){
        fact=fact*i;
      }
      System.out.println("factorial " + fact );
    }
  }