import java.util.Scanner;
class SumOfNums
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter n");
    int n= s.nextInt();
    int sum=0;
    SumOfNums.displaySumOfNums(n,sum);
  }
    public static void displaySumOfNums(int n,int sum)
      {
    int i=1;
    while(i<=n)
      {
       sum=sum+i;
        i=i+1;
      }
    System.out.println(sum);
  }}