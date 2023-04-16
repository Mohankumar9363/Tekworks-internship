import java.util.*;
class DisplayDuplicateChars{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    displayDuplicateChars(str);
  }
  static void displayDuplicateChars(String str){
    char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++){
      int count=1;
        for(int j=i+1;j<ch.length;j++){
          if(ch[i]==(ch[j])){
            count++;
            break;
      }
      
    }
      if(count>1)
        System.out.println(ch[i]);
  }
  }}