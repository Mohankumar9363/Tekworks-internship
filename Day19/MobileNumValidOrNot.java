//Check whether the given mobile number is valid or not
import java.util.*;
class MobileNumValidOrNot{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the mobile number");
    String str= new String();
    str=sc.next();
    displayMobileNumValidOrNot(str);
  }
  static void displayMobileNumValidOrNot(String str){
    if(str.length()==10)
    {
      int count=0;
      for(int i=0;i<str.length();i++){
        if((str.charAt(i)>=0)&&(str.charAt(i)<=9))
           count++;
      }
      if(count==10)
      System.out.println("valid");
      else
        System.out.println("not valid");
    }
    else 
      System.out.println("not valid");
  }
}