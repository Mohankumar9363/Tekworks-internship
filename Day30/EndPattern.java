/* Create a class StringPattern having methods add() and pattern() to take input and verify whether each word starts and ends with the same alphabet or not, if not generate a custom exception. Test your code for any 4 different test cases. Use an array of objects for the test cases. */
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
    if(str.charAt(0)==str.charAt(str.length()-1)){
      System.out.println("staring and ending of the word " + str + " is same ");
    }
      else{
        throw new InvalidWordException("staring  and ending of the word " + str + " is not same ");
      }
    }
      catch(InvalidWordException w){
      System.out.println("Error : " + w.getMessage());
      }
    }
  }
}
class StringPatternTest{
  public static void main(String[] args){
      StringPattern sp[]=new StringPattern[4];
      for(int i=0;i<4;i++){
        sp[i]=new StringPattern();
        sp[i].add();
        sp[i].pattern();
      }
  }
}
