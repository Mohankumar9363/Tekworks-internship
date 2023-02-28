import java.util.Scanner;
class StopNum {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter m");
    int m= s.nextInt();
    System.out.println("enter n");
    int n= s.nextInt();
    System.out.println("enter Stop Number");
    int stop_num= s.nextInt();
    StopNum.Even( m, n, stop_num);
  }
  public static  void Even(int m,int n,int stop_num)
    {
  for (int x=n;x>=m;x--)
    {  
    if (x%2==0 && x%3==0)
    {
       if (x==stop_num)
         break;
      System.out.println(x);
      
    }
}}}