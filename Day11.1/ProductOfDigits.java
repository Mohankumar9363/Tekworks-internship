import java.util.Scanner;
class ProductOfDigits
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
     displayProductOfDigits(num);
    }
    public static void displayProductOfDigits(int num)
    {
  int product=1;
  while(num>0){    
   int r=num%10;    
   product=product*r;    
   num=num/10;    
  }       
   System.out.println("Reverse Number is"+ product);    
     
}  
}  