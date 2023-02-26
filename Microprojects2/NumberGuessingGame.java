//1. Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.
import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame
  {
    public static void main(String args[])
    {
      
      Random random = new Random();
      long randomnum = random.nextLong(); 
      displayNumberGuessingGame(randomnum);
    }
    public static void displayNumberGuessingGame(long randomnum)
    {
      for (int i=0;i>=0;i++)
        {
          Scanner s=new Scanner(System.in);
          System.out.println("enter the number");
         long num=s.nextLong();
          if(num!=randomnum)
              System.out.println("you lose");    
          else
          {
            System.out.println("you win");
            break;
          }
          
        }
    }
  }