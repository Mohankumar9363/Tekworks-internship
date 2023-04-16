/*Create a class called StringCheck having methods add() & Check()  to give data and verify each word ending with “ing”. Generate a custom exception if the string not ending with “ing”. Test this application for any 4 different text inputs. Use an array of objects for the test cases. */
import java.util.*;
class InvalidStringException extends Exception{
    InvalidStringException(String msg){
        super(msg);
    }
}
class StringCheck{
    String str;
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("Give data to the string");
        str=sc.nextLine();
    }
    void check(){
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
                String word=arr[i];
        try{
            if(!((word.charAt(word.length()-1)=='g')&&(word.charAt(word.length()-2)=='n')&&(word.charAt(word.length()-3)=='i'))){
                throw new InvalidStringException("word is not ending with ing");
            }
            else
                System.out.println("valid word");
            }
        catch(InvalidStringException e)
            {
                System.out.println("Error "+e.getMessage());
            }
    
}
}
class ChecKIng{
    public static void main(String args[]){
        StringCheck s[]=new StringCheck[4];
        for(int i=0;i<4;i++){
            s[i]=new StringCheck();
            s[i].read();
            s[i].check();
        }
    }
}