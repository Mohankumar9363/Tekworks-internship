import java.util.Scanner;
class naturalNums
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter n");
    int n= s.nextInt();
    naturalNums.displaynaturalNums(n);
  }
    public static void displaynaturalNums(int n)
    {
    int i=1;
    while(i<=n)
      {
        System.out.println(i);
        i=i+1;
      }
  }}