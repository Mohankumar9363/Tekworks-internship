import java.util.Scanner;
class FirstLastDigits
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
      FirstLastDigits.displayLastDigit(num);
      FirstLastDigits.displayFirstDigit(num);
    }
    public static void displayLastDigit(int num)
    {
      int LastDigit=num%10;
      System.out.println("last digit is"+ LastDigit);
    }
    public static void displayFirstDigit(int num)
    {
      while(num>=10) {
            num /= 10;
        }
        System.out.println("First digit is: "+num);
        }  
  }