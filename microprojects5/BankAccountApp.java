/*Bank Account: Create a class called BankAccount that has properties such as account number, balance, and account holder name. Create subclasses such as CheckingAccount, SavingAccount and CreditAccount that inherit from BankAccount and add additional properties such as interest rate or credit limit. Create methods to deposit and withdraw money, check the balance and return the account details in the parent class, and override them in the subclasses to implement specific behavior for each account type.*/
import java.util.*;
 class BankAccount{
  long account_num;
  double balance;
  String accountholder_name;
    public BankAccount(long account_num,double balance,String accountholder_name){
   this.account_num=acc_num;
   this.balance=bal;
   this.accountholder_name=accholder_name;
  }
  void deposit(){
    Scanner sc=new Scanner(System.in);
      double deposit_amount=sc.nextDouble();
      balance=balance+deposit_amount;
  }
    void withdraw(){
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        if(amount<=balance&&amount!=0)
            balance=balance-amount;
        else
            System.out.println("Amount should be less than balance amount");
    }
    void accountDetails()
    {
        System.out.println("Account Holder Name is "+accountholder_name);
        System.out.println("Account Number is "+account_num);
        System.out.println("Account Balance amount is "+balance);
    }
}
 class CheckingAccount extends BankAccount{
    double monthlyFee;
      CheckingAccount(long account_num,double balance,String accountholder_name,double monthlyFee){
        super(account_num,balance,accountholder_name);
        this.monthlyFee = monthlyFee;
    }
     void MonthlyFee() {
        balance=balance-monthlyFee;
    }
    }
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(long account_num,double balance,String accountholder_name,double interestRate){
        super(account_num, balance, accountholder_name);
        this.interestRate=interestRate;
    }
    void InterestRate(){
        balance=balance*interestRate;  
    }
}
class CreditAccount extends BankAccount{
    double creditLimit;
    CreditAccount(long account_num,double balance,String accountholder_name,double creditLimit){
        super(account_num, balance, accountholder_name);
        this.creditLimit=creditLimit;
    }
    void Credit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter credit amount");
        double creditAmount=sc.nextDouble();
        if(creditAmount<=creditLimit){
            creditLimit=creditLimit-creditAmount;
            System.out.println("remaining credit balance is "+creditLimit);
        }
        else
            System.out.println("credit amount should be less than credit limit");
    }
}
class BankAccountApp{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Account Number");
        long account_num=sc.nextLong();
        System.out.println("enter Account Balance");
        double balance=sc.nextDouble();
        System.out.println("enter Account Holder Name");
        String accountholder_name=sc.nextline();
        BankAccount ba=new BankAccount(account_num,balance,accountholder_name);
        System.out.println("1.deposit "+"2.withdraw "+"3.Account Details "+"4.Checking Account(monthly fee)"+"5.Savings Account(interest rate)"+"6.credit account "+"7.Exit");
        int opt=0;
while(opt!=7){
    System.out.println("enter the option from above(1-7)");
    opt=sc.nextInt();
switch(opt){
    case 1:ba.deposit();
            break;
    case 2:ba.withdraw();
        break;
    case 3:ba.accountDetails();
        break;
        
    case 4:System.out.println("enter monthly fee");
        double monthlyFee=sc.nextDouble();
        CheckingAccount ca=new CheckingAccount(account_num,balance,accountholder_name,monthlyFee);
      ca.MonthlyFee();
        break;
        
    case 5: System.out.println("enter interest rate");
        double interestRate=sc.nextDouble();
        SavingsAccount sa=new SavingsAccount(account_num,balance,accountholder_name,interestRate);
        sa.InterestRate();
        break;
    case 6:System.out.println("enter credit limit");
        double creditLimit=sc.nextDouble();
        CreditAccount cra=new CreditAccount(account_num,balance,accountholder_name,creditLimit);
        cra.Credit();
        break;
    }}
    }
}