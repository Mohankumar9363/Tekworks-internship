import java.util.*;
class InvalidAtmPinException extends Exception {
    
     InvalidAtmPinException(String message) {
       super(message); 
    }
}
class AtmPin{
    String pin_num;
    AtmPin(String pin_num){
        this.pin_num=pin_num;
    } 
    void verifyPin() throws InvalidAtmPinException{
        int count=0;
        if(pin_num.length()==4)
        {
            for(int i=0;i<4;i++)
            {
                if(pin_num.charAt(i)>='0'&&pin_num.charAt(i)<='9')
                    count++;
            }
        }
        if(count==4){
        if(pin_num==0000)
            System.out.println("valid pin number");
        else 
            throw new InvalidAtmPinException("Invalid pin number");
    }}
}
class AtmPinException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 4 digit pin number");
        String pin_num=sc.next();
        AtmPin a=new AtmPin(pin_num);
        try{
            a.verifyPin();
        }
        catch(InvalidAtmPinException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}