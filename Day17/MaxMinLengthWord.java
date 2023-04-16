import java.util.*;
class MaxMinLengthWord{
  public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Give data to String");
    String str=new String();
    str=sc.nextLine();
    String strarray[]=str.split(" ");
    displayMaxLengthWord(strarray);
    displayMinLengthWord(strarray);
  }
    public static void displayMaxLengthWord(String strarray[]){
      String max=strarray[0];
      for(int i=0;i<strarray.length;i++){
                if(max.length()<strarray[i].length())
                {
                  max=strarray[i];
                }
      }
      System.out.println(max);
    }
  public static void  displayMinLengthWord(String strarray[]){
    String min=strarray[0];
      for(int i=0;i<strarray.length;i++){
                if(min.length()>strarray[i].length())
                {
                  min=strarray[i];
                }
      }
      System.out.println(min);
    }
  }
