import java.util.*;
class CharType{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayCharType(str);
  }
  public static void displayCharType(String str){
    int vowel_count=0;
    int consonant_count=0;
    int digit_count=0;
    int space_count=0;
    int SpecialChar_count=0;
   for(int i=0;i<str.length();i++){  
 if ( (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || 
              (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ) {    if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')&&str.charAt(i)!=' ')
        vowel_count++;
      
else 
     consonant_count++;
}                                
else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
    digit_count++;
else if(str.charAt(i)==' ')
  space_count++;
     else
       SpecialChar_count++;
    }
    System.out.println("vowel count is:"+vowel_count);
    System.out.println("consonant count is:"+consonant_count);
    System.out.println("digit count is:"+digit_count);
    System.out.println("space count is:"+space_count);
    System.out.println("SpecialChar count is:"+SpecialChar_count);

  }}
  
