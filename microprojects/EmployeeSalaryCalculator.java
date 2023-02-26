import java.util.Scanner;

public class EmployeeSalaryCalculator {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char option;
    do {
      double monthly_salary = getMonthlySalary(s);
      double annual_salary = calculateAnnualSalary(monthly_salary);
      double tax = calculateTax(annual_salary);
      double net_salary = calculateNetSalary(annual_salary, tax);
      printResult(annual_salary, tax, net_salary);
      System.out.println("Do you want to enter again? (y/n)");
      option = s.next().charAt(0);
    } while (option != 'n');
  }

  public static double getMonthlySalary(Scanner s) {
    System.out.println("Enter the monthly salary:");
    double monthly_salary = s.nextDouble();
    return monthly_salary;
  }

  public static double calculateAnnualSalary(double monthly_salary) {
    double annual_salary = monthly_salary * 12;
    return annual_salary;
  }

  public static double calculateTax(double annual_salary) {
    double tax;
    if (annual_salary <= 5000000) {
      tax = annual_salary * 0.10;
    } else if (annual_salary <= 7000000) {
      tax = annual_salary * 0.20;
    } else {
      tax = annual_salary * 0.30;
    }
    return tax;
  }

  public static double calculateNetSalary(double annual_salary, double tax) {
    double net_salary = annual_salary - tax;
    return net_salary;
  }

  public static void printResult(double annual_salary, double tax, double net_salary) {
    System.out.println("Annual salary is " + annual_salary);
    System.out.println("Tax paid is " + tax);
    System.out.println("Net salary is " + net_salary);
  }
}