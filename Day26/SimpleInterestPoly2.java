import java.util.*;
class SimpleInterestParent{
  double SI;
  void SimpleInterest1(double p,double r,int t){
    SI=(p*t*r)/100;
    System.out.println("Simple interest is"+SI);
  }
}
class SimpleInterestChild extends SimpleInterestParent{
    double SI;
  void SimpleInterest1(double p,double r,int t){
    SI=(p*t*r)/100;
    System.out.println("Simple interest is"+SI);
  }
}
class SimpleInterestPoly2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    SimpleInterestParent sc=new SimpleInterestParent();
    SimpleInterestChild s=new SimpleInterestChild();
    System.out.println("enter the principal in integer");
    int p=sc.nextInt();
    System.out.println("enter Annual Interest Rate");
    double r=sc.nextDouble();
    System.out.println("enter no of years");
    int t=sc.nextInt();
    s.SimpleInterest1(p, r, t);
    sc.SimpleInterest1(p, r, t);

  }
}