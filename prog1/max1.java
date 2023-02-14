
//Write a java program to find maximum between three numbers.
import java.util.Scanner;
class max1 {
  public static void main(String[] args) {
    int a, b, c;

    Scanner obj = new Scanner(System.in);
    a = obj.nextInt();
    b = obj.nextInt();
    c = obj.nextInt();
    if (a >= b && a >= c)
      System.out.println(" max num is" + a);
    else if (b >= a && b >= c)
      System.out.println("max num is" + b);
    else
      System.out.println("max num is" + c);
  }
}