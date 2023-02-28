import java.util.Scanner;
class SumOfDigits
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
     displaySumOfDigits(num);
    }
    public static void displaySumOfDigits(int num)
    {
  int sum=0;
  while(num>0){    
   int r=num%10;    
   sum=sum+r;    
   num=num/10;    
  }       
   System.out.println("Sum of Digits is"+ sum);    
     
}  
}  