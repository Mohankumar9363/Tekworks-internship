import java.util.*;
class StringToInteger{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayStringToInteger(str);
  }
    static void displayStringToInteger(String str){
      int num=Integer.parseInt(str);
      System.out.println(num);
    }}
  