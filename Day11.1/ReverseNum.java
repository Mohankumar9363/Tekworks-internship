import java.util.Scanner;
class ReverseNum
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
     ReverseNum.displayReverseNum(num);
    }
    public static void displayReverseNum(int num)
    {
  int sum=0;
  while(num>0){    
   int r=num%10;    
   sum=(sum*10)+r;    
   num=num/10;    
  }       
   System.out.println("Reverse Number is"+ sum);    
     
}  
}  