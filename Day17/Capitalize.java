import java.util.*;
class Capitalize{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayCapitalize(str);
  }
  public static void displayCapitalize(String str){
    System.out.println(str.toUpperCase());
  }}