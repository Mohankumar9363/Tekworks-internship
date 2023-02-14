import java.util.Scanner;
class leap {
  public static void main(String[] args) {
  int x;
  Scanner s = new Scanner(System.in);
    x=s.nextInt();
  if (( (x%4==0) &&  (x%100!=0) )|| (x%400==0))
     System.out.println("leap year");
  else
     System.out.println("not a leap year");
  }}