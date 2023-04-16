abstract class Bank{
 abstract double interestRate();
abstract void annualProfit();
}
class SBI extends Bank
  {
    double interestRate()
    {
      return 9.75;
    }  
    void annualProfit()
    {
      System.out.println("This year got 30% profit");
    }
  }
class ICICI extends Bank
{
   double interestRate()
    {
      return 19.75;
    }  
    void annualProfit()
    {
      System.out.println("This year got 40% profit");
    }
}
class AbstractExample{
  public static void main(String args[]){
    SBI sbi=new SBI();
    System.out.println(sbi.interestRate());
    sbi.annualProfit();
    ICICI icici=new ICICI();
    System.out.println(icici.interestRate());
    icici.annualProfit();
  }
}