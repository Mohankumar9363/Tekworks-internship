
/*String Replacer: Create an application that takes a string and a word as input and replaces all occurrences of the word with another word. Use strings to manipulate the input string.*/
import java.util.*;
class ReplaceMicroProject{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Give data to the String");
    String str=new String(s.nextLine());
   System.out.println("Give data to the word");
  String word=new String(s.next());
    displayReplaceMicroProject(str,word);
  }
  static void displayReplaceMicroProject(String str,String word){
    Scanner s=new Scanner(System.in);
    System.out.println("Give data to  replace the word");
    String replace_word=new String(s.next());
    String str1[]=new String[10];
    str1=str.split(" ");
    for(int i=0;i<str1.length;i++){
        if(str1[i].equals(word)){
         str1[i]=replace_word;
        }
    }  
   for(String h:str1)
        System.out.print(h+" ");
  }
}