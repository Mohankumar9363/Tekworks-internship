/*Text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common word*/
import java.util.*;
class TextAnalyzer{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    System.out.println("Number of characters are:"+displayNoOfCahrs(str));
    System.out.println("No of words are:"+displayCountWords(str));
    System.out.println("the most common word is:"+displayMostCommonWord(str));
    System.out.println("the no of lines are:"+displayNoOfLines(str));
  }
  public static int displayNoOfCahrs(String str){
    return str.length();
  }
  public static int displayCountWords(String str){
    int count=1;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)==' ')
        count++;
    }
    return count;
  }
    public static String displayMostCommonWord(String str){
      String common_word=new String();
      int count1=0;
      String strarray[]=str.split(" ");
      for(int i=0;i<strarray.length;i++){
              int count=0;
            for(int j=0;j<strarray.length;j++){
              if(strarray[i]==strarray[j])
                count++;
              }
              if(count>=count1){
                common_word=strarray[i];
                count1=count;
              }
      }
        return common_word; 
    }
      static int displayNoOfLines(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
          if(str.charAt(i)=='\n')
            count++;
        }
        return count;
      }

}