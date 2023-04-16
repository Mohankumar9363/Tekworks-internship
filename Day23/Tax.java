import java.util.*;
 
class Tax {
  double GST;
  double amount;
 
  Tax() {
 
  }
 
  Tax(double GST, double amount) {
    this.GST = GST;
    this.amount = amount;
  }
 
  void getDetails() {
    System.out.println(GST + " " + amount);
  }
}
 
class State extends Tax {
  double stategst;
 
  State(double am, double gt, double stategst) {
    super();
    this.amount = am;
    this.GST = gt;
    this.stategst = stategst;
  }
 
  void getDetails() {
    System.out.println(stategst);
  }
 
  void calculateTax() {
    double totalnationtax;
    double totalstatetax;
    totalnationtax = amount + (GST * 13 / 100);
    totalstatetax = amount + (stategst * 20 / 100);
    System.out.println("total tax" + totalnationtax);
    System.out.println("total state tax" + totalstatetax);
 
  }
}
 
class TaxMain {
  public static void main(String p[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter amount,gst and stategst");
    double am = s.nextDouble();
    double gst = s.nextDouble();
    double sgst = s.nextDouble();
    Tax t = new Tax(am, gst);
    State st = new State(am, gst, sgst);
    t.getDetails();
    st.getDetails();
    st.calculateTax();
    t.claculateTax();
  }
}