//Write a java program to check whether a number is negative, positive or zero.
import java.util.Scanner;
class numtype 
{
  public static void main(String[] args) 
  {
    int x;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    if (x>0)
      System.out.println("num is positive");
    else if (x<0)
      System.out.println("num is negative");
    else
     System.out.println("num is negative");
  }
}
