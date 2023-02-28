import java.util.Scanner;
class CountDigits
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
      CountDigits.displayCountDigits(num);
    }
    public static void displayCountDigits(int num)
    {
      int count=0;
      while(num!=0)
        {
          int res=num%10;
          num=num/10;
          count+=1;
        }
      System.out.println("no of digits are"+ count);
    }
  }