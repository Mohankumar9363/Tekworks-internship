import java.util.Scanner;
class Logical
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner s =new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      System.out.println(a>b);
      System.out.println(a>=b);
      System.out.println(a<=b);
      System.out.println(a<b);
    }
  }