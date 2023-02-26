
import java.util.Scanner;
public class LeapYearChecker {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char option;
    do{
      System.out.println("Enter year to check");
    int year=s.nextInt();
    if (( (year%4==0) &&  (year%100!=0) )|| (year%400==0))
     System.out.println("leap year");
  else
      {    
        System.out.println("not a leap year");
    }System.out.println("Do you want to chech another year");
      option = s.next().charAt(0);
    } while (option != 'n');
  }}