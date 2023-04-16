import java.util.*;
class Anagram{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String1");
    String str1=new String();
    str1=sc.nextLine();
    System.out.println("Give data to String2");
    String str2=new String();
    str2=sc.nextLine();
    displayAnagram(str1,str2);
  }
  static void displayAnagram(String str1,String str2){
    int count=0;
    char ch1[]=str1.toCharArray();
    for (int i = 0; i < ch1.length; i++)   
        {  
        for (int j = i + 1; j <ch1.length; j++)   
        {  
        char temp = ' ';  
        if (ch1[i] > ch1[j])   
        {  
        temp = ch1[i];  
        ch1[i] = ch1[j];  
        ch1[j] = temp;  
        }}}
    char ch2[]=str2.toCharArray();
    for (int i = 0; i < ch2.length; i++)   
        {  
        for (int j = i + 1; j <ch2.length; j++)   
        {  
        char temp = ' ';  
        if (ch2[i] > ch2[j])   
        {  
        temp = ch2[i];  
        ch2[i] = ch2[j];  
        ch2[j] = temp;  
        }}}
    if(ch1.length!=ch2.length)
      System.out.println("Not a anagram");
    for(int i=0;i<ch1.length;i++)
      {
        if(ch1[i]!=ch2[i]){
          count=1;
        }
        else continue;
      }
    if(count==1)
      System.out.println("Not a anagram");
    else
            System.out.println("its a Anagram");
  }}
    
           
        