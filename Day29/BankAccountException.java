import java.util.*;
class WithdrawException extends Exception{
    WithdrawException(String message){
        super(message);
    }
}
class Bank{
    String customerName;
    int balance;
    int withdrawAmount;
    Scanner sc=new Scanner(System.in);
    void readName(){
        System.out.println("enter customer name");
        try{
            customerName =sc.nextLine();
        }
        catch(InputMismatchException e){
            System.out.println("customer name should contain only alphabets");
    readName();     
        }
    }
    void readBalance(){
        System.out.println("enter balance");
        try{
            balance =sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("balance  should contain only integers");
            readBalance();
        }
    }
    void readWithdrawAmount(){
        System.out.println("enter withdraw Amount ");
        try{
            withdrawAmount =sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("withdraw Amount  should contain only integers");
            readWithdrawAmount();
        }
    }
    void withdraw() {
        if((withdrawAmount>balance) || (withdrawAmount<=0)){
            try{
            throw new WithdrawException("withdraw amount should be less than to balance");
    }
        catch(WithdrawException e){
            System.out.println("ERROR :"+e.getMessage());
        }}
        else 
            balance=balance-withdrawAmount;
    }
void display()
    {
    System.out.println("Customer details");
    System.out.println("customer name "+customerName);
    System.out.println("balance amount "+balance);
    }
}
class BankAccountException
    {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter no of customers in a bank");
                int num=sc.nextInt();
            Bank b[]=new Bank[num];
            for(int i=0;i<num;i++){
                b[i]=new Bank();
                b[i].readName();
                b[i].readBalance();
                b[i].readWithdrawAmount();
                b[i].withdraw();
                b[i].display();
            }
        }
    }