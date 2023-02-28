import java.util.Scanner;
class SumOfFirstLastDigit
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
      SumOfFirstLastDigit.displaySumOfFirstLastDigit(num);
    }
    public static void displaySumOfFirstLastDigit(int num)
    {
      int LastDigit=num%10;
       while(num>=10) {
            num /= 10;
        }
       int FirstDigit=num;
   
      int sum=LastDigit + FirstDigit;
      System.out.println("Sum Of First and Last Digit is :"+sum);
        }
  }
