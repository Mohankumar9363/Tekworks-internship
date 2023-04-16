//Create class Capitalize having add(), checkCapital() to read data and to verify whether every word of a given text is starting with an upper case vowel or not if it's not starting with the upper case vowel generate a custom exception.  Test your application for any 5 different inputs. Use an array of objects for the test cases. 
import java.util.*;
class InvalidWordException extends Exception{
  InvalidWordException(String message){
    super(message);
  }
}
class StringPattern{
  String word;
  public void add(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter word");
    try{
    word=sc.nextLine();
  }
    catch(Exception e){
      System.out.println("words name should have only alphabets");
    }
  }
  public void pattern() {
    String array[]=word.split(" ");
    for(int i=0;i<array.length;i++){
      String str=array[i];
    try{
    if(str.charAt(0)=='A'||str.charAt(0)=='E'||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U'){
      System.out.println("valid word");
    }
      else{
        throw new InvalidWordException("staring of word should be start with capital vowel only");
      }
    }
      catch(InvalidWordException w){
      System.out.println("Error : " + w.getMessage());
      }
    }
  }
}
class StartingVowel{
  public static void main(String[] args){
      StringPattern sp[]=new StringPattern[5];
      for(int i=0;i<5;i++){
        sp[i]=new StringPattern();
        sp[i].add();
        sp[i].pattern();
      }
  }
}
