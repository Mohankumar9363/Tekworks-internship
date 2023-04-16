import java.util.*;
class Encryption{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give Data to Encrypt");
    String str=new String(sc.nextLine());
    System.out.println("Give position number to Encrypt");
    int pos=sc.nextInt();
  String r=displayEncryption(str,pos);
    System.out.println("message before encryption"+str);
        System.out.println("message before encryption"+r);
    String res=displayDecryption(r,pos);
   System.out.println("message before decryption"+r);
        System.out.println("message before decryption"+res);
    
}
  public static String displayEncryption(String s,int p){
    String result="";
    for(int i=0;i<s.length();i++){
      result=result+(char)(s.charAt(i)+p%26);
    }
    return result;
  }
  public static String displayDecryption(String r,int p){
    String result="";
    for(int i=0;i<r.length();i++){
      result=result+(char)(r.charAt(i)-p%26);
    }
    return result;
  }}