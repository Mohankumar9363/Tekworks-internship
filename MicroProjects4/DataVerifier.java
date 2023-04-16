import java.util.*;
class DataVerifier{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char opt;
    do{
    System.out.println("which of the following operation you want to perform ");
    System.out.println("1.User name verification");
    System.out.println("2.Password verification");
    System.out.println("3.Mobile number verification");  
    int operation=sc.nextInt();
    switch(operation){
      case 1: usernameverification();
        break;
      case 2: passwordverification();
        break;
      case 3: mobilenumberverification();
        break;
    }
  System.out.println("Do to you want to perform one more operation(y/n)");
      opt=sc.next().charAt(0);
      }while(opt!='n');
  }
    static void usernameverification()
      {
        Scanner sc=new Scanner(System.in);
     System.out.println("enter user name");
    String user_name=new String();
    user_name=sc.nextLine();
      if(user_name.length()>=6){
      int count=0;
      for(int i=0;i<user_name.length();i++){
        if(user_name.charAt(i) >='A' && user_name.charAt(i) <='Z'){
          count++;
          break;
        }
      }
      for(int i=0;i<user_name.length();i++){
        if(user_name.charAt(i) >='a' && user_name.charAt(i) <='z'){
          count++;
          break;
        }
      }
      for(int i=0;i<user_name.length();i++){
        if(user_name.charAt(i) >='0' && user_name.charAt(i) <='9'){
          count++;
          break;
        }
      }
      for(int i=0;i<user_name.length();i++){
        if(user_name.charAt(i) =='@' || user_name.charAt(i) =='-' || user_name.charAt(i)=='.'){
          count++;
          break;
        }
      }
      if(count>=4)
        System.out.println("username is valid");
      else
        System.out.println("username is invalid");
      }
    else
      System.out.println("please enter username atleast 6 minimum character");
      }
    static void passwordverification()
      {
      Scanner sc=new Scanner(System.in);
     System.out.println("enter password");
    String pswrd=new String();
    pswrd=sc.nextLine();
      if(pswrd.length()>=8 && pswrd.length()<=16){
      int count=0;
      for(int i=0;i<pswrd.length();i++){
        if(pswrd.charAt(i) >='A' && pswrd.charAt(i) <='Z'){
          count=count+1;
          break;
        }
      }
      for(int i=0;i<pswrd.length();i++){
        if(pswrd.charAt(i) >='a' && pswrd.charAt(i) <='z'){
          count=count+1;
          break;
        }
      }
      for(int i=0;i<pswrd.length();i++){
        if(pswrd.charAt(i) >='0' && pswrd.charAt(i) <='9'){
          count=count+1;
          break;
        }
      }
      for(int i=0;i<pswrd.length();i++){
        if(pswrd.charAt(i) =='@' || pswrd.charAt(i) =='-' || pswrd.charAt(i)=='.'||pswrd.charAt(i)=='#'||pswrd.charAt(i)=='$'){
          count=count+1;
          break;
        }
      }
      if(count>=4)
        System.out.println("password is valid");
      else
        System.out.println("password is invalid");
      }
    else
      System.out.println("please enter password atleast minimum 8 to 16 character");
      }
    static void mobilenumberverification()
      {
        Scanner sc=new Scanner(System.in);
     System.out.println("enter mobile number");
    String mobile_num=new String(sc.nextLine());
      if(mobile_num.length()==10){
       int count=0;
        for(int i=0;i<mobile_num.length();i++){
          if(mobile_num.charAt(i) > '0' || mobile_num.charAt(i) < '9'){
            count=count+1;
          }
        }
       if (count==10){
         System.out.println(" mobile number is valid");
       }
     }
    else 
       System.out.println("please enter 10 digit mobile number");
      }
  }