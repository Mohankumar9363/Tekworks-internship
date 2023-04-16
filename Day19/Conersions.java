import java.util.*;
class Conversions{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=10;
    double num1=12.37;
    long num2=1233456686;
    boolean cond=true;
    String str=Integer.toString(num);
    System.out.println(str);
    String str1=Double.toString(num1);
        System.out.println(str1);
    String str2=Long.toString(num2);
        System.out.println(str2);
    String str3=Boolean.toString(cond);
       System.out.println(str);
    String s1="12";
    String s2="12.56";
    String s3="234456678";
    String s4="false";
    int n1=Integer.parseInt(s1);
    System.out.println(n1);
    int n2=Double.parseDouble(s2);
    System.out.println(n2);
    int n3=Long.parseLong(s3);
    System.out.println(n3);
    int n4=Boolean.parseBoolean(s4);
    System.out.println(n4);
  }
}