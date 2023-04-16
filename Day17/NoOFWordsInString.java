import java.util.*;
class NoOFWordsInString{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayNoOFWordsInString(str);
  }
  public static void displayNoOFWordsInString(String str){
    int count=1;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==' ')
        count++;
    }
    System.out.println("No of words are:"+count);
  }}