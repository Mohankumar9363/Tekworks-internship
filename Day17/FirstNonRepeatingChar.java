import java.util.*;
class FirstNonRepeatingChar{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayFirstNonRepeatingChar(str);
  }
  static void displayFirstNonRepeatingChar(String str){
    for(int i=0;i<str.length();i++)
    {
    if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
    {
    System.out.println(str.charAt(i));
    break;
    }}
    
    }}