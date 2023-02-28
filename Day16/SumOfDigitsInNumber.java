import java.util.Scanner;
class SumOfDigitsInNumber
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      long num=s.nextLong();
     displaySumOfDigitsInNumber(num);
    }
    public static void displaySumOfDigitsInNumber(long num)
    {
  long sum=0;
  while(num>0){    
   long r=num%10;    
   sum=sum+r;    
   num=num/1000;    
  }       
   System.out.println("Sum of Digits is"+" "+ sum);        
}  
}  