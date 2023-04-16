import java.util.*;
 
class AtmCustomException {
  public static void main(String a[]) {
   int ATMpin=2342;
    try
      {
        if(ATMpin!=1111)
         throw new Exception();
        
      }
    catch(Exception w)
      {
      System.out.println("Invalid ATM pin no");
      }
  }
}