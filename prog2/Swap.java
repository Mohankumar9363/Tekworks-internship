import java.util.Scanner;
class Swap
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter two numbers");
      int a=s.nextInt();
      int b=s.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("value of a is"+" "+a +" "+ "and value of b is"+" "+ b);
        
        }}