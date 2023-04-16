//Generate Custome exception if the password is not having at least one upper case, one lower case and one digit
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
        int count=0;
        for(int i=0;i<pswrd.length();i++){
            if(pswrd.charAt(i)>='A'&&pswrd.charAt(i)<='Z'){
                count++;
                break;
            }
        }
        for(int i=0;i<pswrd.length();i++){
            if(pswrd.charAt(i)>='a'&&pswrd.charAt(i)<='z'){
                count++;
                break;
            }
        }
        for(int i=0;i<pswrd.length();i++){
            if(pswrd.charAt(i)>='0'&&pswrd.charAt(i)<='9'){
                count++;
                break;
            }     
        }
        if(count==3)
            System.out.println("Valid Password");
        else
            throw new InvalidPassword("Invalid password");
    }
}
class PasswordVerify{
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