import java.util.*;
class InvalidMobileNumberException extends Exception {
    
     InvalidMobileNumberException(String message) {
       super(message);
    
    }
}
class MobileNum{
    String mobile_num;
    MobileNum(String mobile_num){
        this.mobile_num=mobile_num;
    }
    void checkMobileNum() throws InvalidMobileNumberException{
        int count=0;
      if(mobile_num.length()==10)
       {
      for(int i=0;i<mobile_num.length();i++){
        if((mobile_num.charAt(i)>='0')&&(mobile_num.charAt(i)<='9'))
           count++;
      }
       }
      if(count==10)
      System.out.println("valid mobile number");
      else
       throw new InvalidMobileNumberException("Invalid mobile number"); 
    }
}
class MobileNumException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Mobile number");
        String mobile_num=sc.next();
        MobileNum m=new MobileNum(mobile_num);
        try{
            m.checkMobileNum();
        }
        catch (InvalidMobileNumberException e){
            System.out.println(e.getMessage());
        }
    }
}