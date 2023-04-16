//Generate Custome exception if the given password is not equal to "abc123"
import java.util.*;
class InvalidPassword extends Exception{
    InvalidPassword(String message){
        super(message);
    }
}
class Password{
    String pswrd;
    Password(String pswrd){
        this.pswrd=pswrd;
    }
    void verifyPassword() throws InvalidPassword{
        if(pswrd.equals("abc123"))
            System.out.println("Valid Password");
        else
            throw new InvalidPassword("Invalid password");
    }
}
class PasswordException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password");
        String pswrd=sc.next();
        Password p=new Password(pswrd);
        try{
            p.verifyPassword();
        }
        catch(InvalidPassword e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}