import java.util.*;
class ReplaceWithPalindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to the String");
    String str= new String();
    str=sc.nextLine();
    displayReplaceWithPalindrome(str);
  }
  static void displayReplaceWithPalindrome(String str){
    String s1[]=str.split(" ");
    for(int j=0;j<s1.length;j++){
       String s2=s1[j];
      String revstr="";
      for(int i=s2.length()-1;i>=0;i--){
       
        revstr=revstr+s2.charAt(i);
      }
      if(s2.equals(revstr)){
       s1[j]="plaindrome";
      }
     
    }
    for(String h:s1)
      System.out.print(h+" ");
  }
  }
