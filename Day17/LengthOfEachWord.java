import java.util.*;
class LengthOfEachWord{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    String strarray[]=str.split(" ");
    displayLengthOfEachWord(strarray);
  }
    public static void displayLengthOfEachWord(String strarray[]){
      for(String h:strarray)
        System.out.println("length of"+h+"is:"+h.length() );
    }}