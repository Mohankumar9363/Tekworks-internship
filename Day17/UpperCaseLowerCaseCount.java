import java.util.*;
class UpperCaseLowerCaseCount{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayUpperCaseLowerCaseCount(str);
  }
  public static void displayUpperCaseLowerCaseCount(String str){
    int upper_count=0;
    int lower_count=0;
    
   for(int i=0;i<str.length();i++){  
 if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
   lower_count++;
  else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
     upper_count++;
   }
    System.out.println("no of upper case lettera are:"+upper_count);
    System.out.println("no of lower case lettera are:"+lower_count);
  }}