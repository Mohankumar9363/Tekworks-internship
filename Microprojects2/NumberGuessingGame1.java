import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame1
  {
    public static void main(String args[])
    {
      
      Random random = new Random();
      int randomnum = random.nextInt(100); 
      displayNumberGuessingGame1(randomnum);
    }
    public static void displayNumberGuessingGame1(long randomnum)
    {
      for (int i=0;i>=0;i++)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("enter the number");
         long num=s.nextLong();
          if(num!=randomnum){
              System.out.println("you lose");  
            System.out.println("clue for guessing the number is below");
            if(num< randomnum)
                System.out.println("Entered Number is less than Actual Number");  
              else
                System.out.println("Entered Number is greater than Actual Number");  
          }      
          else
          {
            System.out.println("you win");
            break;
          }
          
        }
    }
  }