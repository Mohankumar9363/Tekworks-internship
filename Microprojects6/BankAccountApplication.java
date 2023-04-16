/*Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.*/
import java.util.*;
class BankAccount{
  long account_number;
  double balance;
    BankAccount(long account_number,double balance){
        this.account_number=account_number;
        this.balance=balance;
    }
    void getAccountDetails(){
        System.out.println("Account number is "+account_number);
        System.out.println("Account Balance is "+balance);
    }
void deposit()
  {
    System.out.println("enter the amount you want to deposit");
    Scanner sc=new Scanner(System.in);
    long deposit_amount=sc.nextLong();
    balance =balance+deposit_amount;
    System.out.println("deposited successfully");
  }
void withdraw()
  {
    System.out.println("enter the amount you want to withdraw");
    Scanner sc=new Scanner(System.in);
    long withdraw_amount=sc.nextLong();
    try{
    if(withdraw_amount<=balance){
    balance =balance-withdraw_amount;
    System.out.println("withdraw successful");
    }
    else if(withdraw_amount>balance)
        throw new Exception();
    }
      catch(Exception e)
        {
            System.out.println("Insufficient funds");
        }
  }
void checkBalance()
  {
    System.out.println("the Balance amount is:"+ balance);
  }
}
class BankAccountApplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account number");
        long account_number=sc.nextLong();
        System.out.println("enter Balance Amount");
        double balance=sc.nextDouble();
        BankAccount ba=new BankAccount(account_number,balance);
        int opt=0;
        while(opt!=5){
        System.out.println("enter options from below");
        System.out.println("1.Account Details"+" "+"2.deposit "+" 3.withdraw "+" 4.Check Balance"+" 5.exit");
        opt=sc.nextInt();
        switch(opt){
        case 1:ba.getAccountDetails();
                break;
        case 2:ba.deposit();
                break;
        case 3:ba.withdraw();
                break;
        case 4:ba.checkBalance();
                break;
    }}
}}