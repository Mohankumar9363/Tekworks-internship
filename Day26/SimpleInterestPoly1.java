import java.util.*;
class SimpleInterest{
  double SI;
  void SimpleInterest1(double p,double r,int t){
    SI=(p*t*r)/100;
    System.out.println("Simple interest is"+SI);
  }
  void SimpleInterest1(int p,double r,int t){
    SI=(p*t*r)/100;
    System.out.println("Simple interest is"+SI);
  }
}
class SimpleInterestPoly1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    SimpleInterest s=new SimpleInterest();
    System.out.println("enter the principal in integer");
    int p=sc.nextInt();
    System.out.println("enter the principal in double");
    double p1=sc.nextDouble();
    System.out.println("enter Annual Interest Rate");
    double r=sc.nextDouble();
    System.out.println("enter no of years");
    int t=sc.nextInt();
    s.SimpleInterest1(p1, r, t);
    s.SimpleInterest1(p, r, t);
  }
}