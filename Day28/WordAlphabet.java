//Generate Custome exception if starting charcater of word is not an alphabet
import java.util.*;
class InvalidWordException extends Exception{
    InvalidWordException(String message){
        super(message);
    }
}
class Word{
    String word;
    Word(String word){
        this.word=word.toLowerCase();
    }
    void checkWord() throws InvalidWordException{
        
        if(word.charAt(0)>='a'&&word.charAt(0)<='z')
            System.out.println("Valid word");
        else
            throw new InvalidWordException("Invalid word");
    }
}
class WordAlphabet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String word=sc.next();
        Word p=new Word(word);
        try{
            p.checkWord();
        }
        catch(InvalidWordException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}