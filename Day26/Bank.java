/*All the banks operating in India are controlled by RBI. RBI has set well-defined guidelines (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) that all banks must follow. For example, suppose RBI has set the minimum interest rate applicable to a savings bank account to be 4% annually; however, banks are free to use a 4% interest rate or to set any rates above it.
Write a Java program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. Note: Create a few classes namely Customer, Account, RBI (Base Class), and a few derived classes (SBI, ICICI, PNB, etc). Assume and implement required member variables and functions in each class.*/
import java.util.*;
class Customer{
    String name;
    int age;
    long phone;
    String address;
    Customer(String name,int age,long phone,String address){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
    }
    void getCustomerDetails(){
        System.out.println("name of customer is"+name);
        System.out.println("age of customer is"+age);
        System.out.println("mobile number of customer is "+phone);
        System.out.println("address of customer is "+address);
    }    
}
class Account{
    long account_num;
    String ifsc;
    double balance;
    Account(long account_num,String ifsc,double balance){
        this.account_num=account_num;
        this.ifsc=ifsc;
        this.balance=balance;
    }
    void getAccountDetails(){
        System.out.println("Account number is "+account_num);
        System.out.println("ifsc code is "+ifsc);
        System.out.println("balance amount is"+balance);
    }
}
class RBI{
    double minimum_interest_rate;
    double minimum_balance;
    double minimu_withdrawal_limit;

    void getGuideLines(double minimumInterestRate,double minimum_balance,double minimu_withdrawal_limit){
        System.out.println("minimu interest rate set by RBI is"+minimum_interest_rate);   
        System.out.println("minimum balance set by RBI is "+minimum_balance);
        System.out.println("minimum withdrawal limit set by RBI is "+minimu_withdrawal_limit);
    }
}
class SBI extends RBI{
    void getGuideLines(double minimumInterestRate,double minimum_balance,double minimu_withdrawal_limit){
        System.out.println("minimu interest rate set by RBI is"+minimum_interest_rate);   
        System.out.println("minimum balance set by RBI is "+minimum_balance);
        System.out.println("minimum withdrawal limit set by RBI is "+minimu_withdrawal_limit);
    }
}
class PNB extends RBI {
     void getGuideLines(double minimum_interest_rate,double minimum_balance,double minimu_withdrawal_limit){
        System.out.println("minimu interest rate set by RBI is"+minimum_interest_rate);   
        System.out.println("minimum balance set by RBI is "+minimum_balance);
        System.out.println("minimum withdrawal limit set by RBI is "+minimu_withdrawal_limit);
    }
}
class Bank{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("enter mobile number");
        long phone=sc.nextLong();
        System.out.println("enter address");
        String address=sc.nextLine();
        System.out.println("enter account number");
        long account_num=sc.nextLong();
        System.out.println("enter ifsc code");
        String ifsc=sc.nextLine();
        System.out.println("enter balance amlount");
        double balance=sc.nextDouble();
        System.out.println("enter minimum interest rate");
        double minimum_interest_rate=sc.nextDouble();
        System.out.println("enter minimum balance");
        double minimum_balance=sc.nextDouble();
        System.out.println("enter minimun wuthdrwal");
        double minimu_withdrawal_limit=sc.nextDouble();
        Customer c=new Customer(name,age,phone,address);
        Account a=new Account(account_num,ifsc,balance);
        RBI rbi=new RBI();
        SBI sbi=new SBI();
        PNB pnb=new PNB();
        rbi.getGuideLines(minimum_interest_rate, minimum_balance, minimu_withdrawal_limit);
        sbi.getGuideLines(minimum_interest_rate, minimum_balance, minimu_withdrawal_limit);
        pnb.getGuideLines(minimum_interest_rate, minimum_balance, minimu_withdrawal_limit);
    }
}