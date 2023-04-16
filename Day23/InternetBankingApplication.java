import java.util.*;
class InternetBanking{
  String username;
  String password;
  String ifsc_code;
  InternetBanking(){
    username="Mohan@123";
    password="Mohan@123";
    ifsc_code="SBIN0014029";
  }
  void verifyUser(String un,String psd)
  {
    if(username.equals(un)&&password.equals(psd))
      System.out.println("user is valid");
    else
      System.out.println("invalid user");
  }
}
  class InternetBankingApplication{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("enter user name");
      String un=new String(s.nextLine());
      System.out.println("enter password");
      String psd=new String(s.nextLine());
      InternetBanking ib=new InternetBanking();
      ib.verifyUser(un, psd);
    }
  }
    
  
