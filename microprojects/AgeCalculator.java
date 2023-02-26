import java.util.Scanner;

public class AgeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char option;
    do {
      System.out.println("Enter person's birth year:");
      int birthYear = sc.nextInt();
      System.out.println("Enter present year:");
      int currentYear = sc.nextInt();
      int age = calculateAge(birthYear,currentYear);
      String ageGroup = checkAge(age);
      System.out.println("This person is " + ageGroup);
      System.out.println("Do you want to enter another birth year? (y/n)");
      option = sc.next().charAt(0);
    } while (option != 'n');
  }
  
  public static int calculateAge(int birthYear, int currentYear) {
    int age = currentYear - birthYear;
    return age;
  }
  
  public static String checkAge(int age) {
    if (age < 18) {
      return "minor";
    } else {
      return "major";
    }
  }
  
  
}