//Replace vowel with "000"
import java.util.*;
class ReplaceVowel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("give data to the String");
    String str1=new String(sc.nextLine());
    String str=str1.toLowerCase();
    display(str);
  }
  static void display(String str){
      char arr1[]=str.toCharArray();
      for(int j=0;j<arr1.length;j++){
        if(arr1[j]=='a'||arr1[j]=='e'||arr1[j]=='i'||arr1[j]=='o'||arr1[j]=='u')
          arr1[j]='0';
      }
     String s=new String(arr1);
    String s1=s.replace("0","000");
   System.out.println(s1);
    }  
  }
