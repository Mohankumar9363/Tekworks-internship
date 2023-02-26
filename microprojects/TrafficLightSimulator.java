import java.util.Scanner;

public class TrafficLightSimulator {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char option;
    do {
      int time = getTime(s);
      String signal = getSignal(time);
      System.out.println(signal);
      System.out.println("Do you want to enter again ");
      option = s.next().charAt(0);
    } while (option != 'n');
  }
  
  public static int getTime(Scanner s) {
    System.out.println("Enter the time in seconds within 60sec");
    int time = s.nextInt();
    return time;
  }
  
  public static String getSignal(int time) {
    if (time > 0 && time <= 20) {
      return "Green signal";
    } else if (time > 20 && time <= 40) {
      return "Red signal";
    } else {
      return "Yellow signal";
    }
  }
}