import java.util.*;
class InvalidWithdrawAmount extends Exception{
    InvalidWithdrawAmount(String msg){
        super(msg);
    }
}
class WithdrawAmount{
    String amount;
    WithdrawAmount(String amount)
    {
        this.amount=amount;
    }
    void verifyAmount() throws InvalidWithdrawAmount{
        int count=0;
        for(int i=0;i<amount.length();i++){
            if(amount.charAt(i)>='0'&&amount.charAt(i)<='9')
                count++;
        }
        if(count==amount.length())
            System.out.println("Valid Amount");
        else
            throw new InvalidWithdrawAmount("Invalid Amount to make Withdraw");
    }
}
class WithdrawException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount to withdraw");
        String amount=sc.next();
        WithdrawAmount w=new WithdrawAmount(amount);
        try{
            w.verifyAmount();
        }
        catch(InvalidWithdrawAmount e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
