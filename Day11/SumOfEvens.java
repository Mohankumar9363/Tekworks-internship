import java.util.Scanner;
class SumOfEvens {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter n");
    int n= s.nextInt();
    int sum=0;
  SumOfEvens.displaySumOfEvens(n,sum);
  }
  public static void displaySumOfEvens(int n,int sum)
  {
  for (int x=1;x<=n;x++)
    {
    if (x%2==0)
      sum=sum+x;
    }
    System.out.println(sum);
  }}