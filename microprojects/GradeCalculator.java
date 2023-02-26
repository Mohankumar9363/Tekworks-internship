import java.util.Scanner;

public class GradeCalculator {
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char option;
    do {
      double phy = getMarks(s, "physics");
      double che = getMarks(s, "chemistry");
      double math = getMarks(s, "mathematics");
      double bio = getMarks(s, "biology");
      double comp = getMarks(s, "computer ");
      float per = calculatePercentage(phy, che, math, bio, comp);
      String grade = calculateGrade(per);
      System.out.println("Grade: " + grade);
      System.out.println("Do you want to calculate another student grade? (y/n)");
      option = s.next().charAt(0);
    } while (option != 'n');
  }

  public static double getMarks(Scanner s, String subject) {
    System.out.println("Enter " + subject + " marks:");
    return s.nextDouble();
  }

  public static float calculatePercentage(double phy, double che, double math, double bio, double comp) {
    return (float) ((phy + che + math + bio + comp) / 500) * 100;
  }

  public static String calculateGrade(float per) {
    if (per >= 90) {
      return "A";
    } else if (per >= 80) {
      return "B";
    } else if (per >= 70) {
      return "C";
    } else if (per >= 50) {
      return "D";
    } else {
      return "F";
    }
  }
}