import java.util.Scanner;
class PercentageCalculator
  {
    
public static void  main(String args[])
  {
   Scanner s=new Scanner(System.in);
  System.out.println("enter total no:of  subjects ");
  int n=s.nextInt();
  System.out.println("enter total  subjects marks ");
  double total_marks=s.nextDouble();
  double percentage= (total_marks/(n*100))*100;
  System.out.println("Percentage is "+percentage);
}
  }