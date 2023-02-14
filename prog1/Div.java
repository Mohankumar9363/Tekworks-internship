//Write a java program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class Div {
  public static void main(String[] args) {
    int x;
 Scanner s=new Scanner(System.in);
    x=s.nextInt();

if(x%5==0 && x%11==0)
            System.out.println( " divisible by 5 and 11");
          else
             System.out.println( "not divisible by 5 and 11");
  }}