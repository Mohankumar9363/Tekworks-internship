import java.util.*;
class Palindrome{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayPalindrome(str);
  }
    static void displayPalindrome(String str){
      String revstr="";
      for(int i=str.length()-1;i>=0;i--){
        revstr=revstr+str.charAt(i);
      }
      if(str.equals(revstr))
        System.out.println("its a palindome");
    }}