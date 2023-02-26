import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char option;
    do {

      System.out.println(" (choose rock or paper or scissors)");
      System.out.println("player chose");
      String player_choice = sc.nextLine();

      Random random = new Random();
      int randomnum = random.nextInt(3);

      String computer_choice;
      if (randomnum == 0)
        computer_choice = "rock";
      else if (randomnum == 1)
        computer_choice = "paper";
      else
        computer_choice = "scissors";
      System.out.println("Computer chose " + computer_choice);

      if (player_choice.equals(computer_choice))
        System.out.println("it's Tie");

      else if (player_choice.equals("rock")) {
        if (computer_choice.equals("scissors"))
          System.out.println("player wins");
      }

      else if (player_choice.equals("paper")) {
        if (computer_choice.equals("rock"))
          System.out.println("player wins");
      } else if (player_choice.equals("scissors")) {
        if (computer_choice.equals("paper"))
          System.out.println("player wins");
      } else if (computer_choice.equals("rock")) {
        if (player_choice.equals("scissors"))
          System.out.println("player wins");
      }

      else if (computer_choice.equals("paper")) {
        if (player_choice.equals("rock"))
          System.out.println("player wins");
      } else if (computer_choice.equals("scissors")) {
        if (player_choice.equals("paper"))
          System.out.println("player wins");
      }
      System.out.println("Do you want to play again");
      option = sc.next().charAt(0);
    } while (option != 'n');
  }
}
