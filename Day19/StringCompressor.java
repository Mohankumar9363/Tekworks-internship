import java.util.*;
class StringCompressor{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to the String");
    String str= new String();
    str=sc.nextLine();
    displayStringCompressor(str);
  }
  public static void displayStringCompressor(String str){
    char ch1[]=str.toCharArray();
    int temp[]=new int[str.length()];
    int flag=1;
    
         for (int i = 0; i < ch1.length; i++)   
        {  
          int count=1;
        for (int j = i + 1; j <ch1.length; j++)   
        {
          if(ch1[i]==ch1[j]){
            count++;
           temp[j]=flag;
          }
        }
        if(temp[i]!=flag)
          temp[i]=count;
}
  for(int i=0;i<temp.length;i++){
    if(temp[i]!=flag)
      System.out.println(ch1[i]+""+temp[i]);
  }  
  }}