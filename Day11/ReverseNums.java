import java.util.Scanner;
class ReverseNums
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter n");
    int n= s.nextInt();
    int i=n;
    ReverseNums.displayReverseNums(n,i);
  }
     public static void displayReverseNums(int n,int i)
      {
    while(i>=1)
      {
        System.out.println(i);
        i=i-1;
      }
  }}