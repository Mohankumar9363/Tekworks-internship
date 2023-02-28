import java.util.Scanner;

public class PrimeFactors {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = sc.nextInt();
     displayPrimeFactors(number);
   }
  public static void displayPrimeFactors(int number)
  {
     
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            number = number/i;
           System.out.println(i);
         }

      }
      if(number >2) {
         System.out.println(number);
      }
   }
}