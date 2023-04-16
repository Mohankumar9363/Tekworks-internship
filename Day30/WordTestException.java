/*create class WordTest having add()& testWord() to take input and verify whether every word has at least 3 vowels if the word is not having at least 3 vowels then generate a custom exception. Test your code for any 6 different scenarios.*/
import java.util.*;
class InvalidWordException extends Exception{
    InvalidWordException(String msg){
        super(msg);
    }
}
class WordTest{
    String word;
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("enter word");
        word=sc.next();
         try{
    word=sc.nextLine();
  }
    catch(Exception e){
      System.out.println("words name should have only alphabets");
    } 
    }
    void testWord(){
        int count=0;
      String array[]=word.split(" ");
    for(int i=0;i<array.length;i++){
      String str=array[i];
        for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'){
                    count++;
                }
            }
        try{
        if(count>=3)
            System.out.println("every word has at least 3 vowels");
        else
            throw new InvalidWordException("word is not having at least 3 vowels");
        }
        catch(InvalidWordException q){
            System.out.println("Error :"+q.getMessage());
        }
        }
    }
}

class WordTestException{
    public static void main(String args[]){
        WordTest w[]=new WordTest[6];
        for(int i=0;i<6;i++){
            w[i]=new WordTest();
            w[i].read();
            w[i].testWord();
        }
    }
}