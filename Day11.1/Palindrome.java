import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
      Palindrome.displayPalindrome(num);
    }
    public static void displayPalindrome(int num)
    {
  int temp=num;
  int sum=0;
  while(num>0){    
   int r=num%10;    
   sum=(sum*10)+r;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  