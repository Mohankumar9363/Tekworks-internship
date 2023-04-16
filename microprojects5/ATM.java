/*ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/
import java.util.*;
class Account{
  long account_number;
  double balance;
  String account_holder_name;
  void setdetails()
  {
    System.out.println("enter the details");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter account number");
    account_number=sc.nextLong();
    System.out.println("enter balance amount");
    balance=sc.nextLong();
    System.out.println("enter account holder name");
    String account_holder_name=new String(sc.nextLine());
  }
  void getdetails()
  {
    System.out.println("account_number is"+ " "+account_number);
    System.out.println("balance amount is "+" "+balance);
    System.out.println("account_holder_name is"+account_holder_name);
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
    balance =balance-withdraw_amount;
    System.out.println("withdraw successful");
  }
void checkBalance()
  {
    System.out.println("the Balance amount is:"+ balance);
  }
}

class Atm
{
  public static void main(String args[]){  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of customers");
    int num=sc.nextInt();
    Account a[]=new Account[num];
      for(int i=0;i<num;i++){
    a[i].setdetails();
    a[i].getdetails();
    a[i].deposit();
    a[i].withdraw();
     a[i].checkBalance();
  }}
}