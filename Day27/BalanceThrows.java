import java.util.*;
 
class BalanceThrows {
  public static void main(String a[]) throws Exception
  {
    Scanner p=new Scanner(System.in);
    System.out.println("enter any number");
    long balance=p.nextLong();
    
   if(balance<1000)
     throw new Exception("Minimum balance should be 1000");
   else if (balance >1000000)
      throw new Exception("You are exceding maximum limit");
    else
     System.out.println(balance);
      
}
 
}