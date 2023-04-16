import java.util.*;
class RemoveDuplicatesInString{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayRemoveDuplicatesInString(str);
  }
  static void displayRemoveDuplicatesInString(String str){
    for(int i=0;i<str.length();i++)
    {
    if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
    {
    System.out.println(str.charAt(i));
    
    }}
    
    }}