import java.util.*;
class MaxOccuringChar{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayMaxOccuringChar(str);
  }
  static void displayMaxOccuringChar(String str){
      char common_char=' ';
      int count1=0;
      for(int i=0;i<str.length();i++){
              int count=0;
            for(int j=0;j<str.length();j++){
              if(str.charAt(i)==str.charAt(j))
                count++;
              }
              if(count>=count1){
                common_char=str.charAt(i);
                count1=count;
              }
      }
            System.out.println(common_char);

  }}