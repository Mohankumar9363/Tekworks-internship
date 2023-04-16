import java.util.*;
 
class Polymorphism {
  public double intrestrate;
 
  public void loan(int months) {
    if (months <= 12)
      intrestrate = 7.5;
    else if (months > 12 && months <= 24)
      intrestrate = 8;
    else
      intrestrate = 8.4;
    System.out.println("your current interest rate based on months is " + intrestrate);
  }
 
  public void loan(double civiscore) {
    if (civiscore <= 200)
      intrestrate = 13;
    else if (civiscore > 200 && civiscore <= 400)
      intrestrate = 11;
    else
      intrestrate = 9.5;
    System.out.println("your current interest rate based on civil score  is " + intrestrate);
  }
}
 
class StaticPolymorphism {
  public static void main(String a[]) {
    Polymorphism p = new Polymorphism();
    Scanner s = new Scanner(System.in);
    int months;
    double ciscore;
    System.out.println("enter no of months to know interest rate");
    months = s.nextInt();
 
    System.out.println("enter civil score to know interest rate");
    ciscore = s.nextDouble();
    p.loan(months);  // p.loan(int)
    p.loan(ciscore);  // p.loan(double)
  }
}