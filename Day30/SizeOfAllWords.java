//Create a class StringValid having methods add() & validate() for reading and validating whether the size of all words in the given text are equal if not generate a custom exception. Test your code for any 4 different input texts. Use an array of objects for the test cases. 
import java.util.*;
class InvalidTextException extends Exception{
    InvalidTextException(String msg)
    {
        super(msg);
    }
}
class StringValid{
    String text;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text");
        text=sc.nextLine();
    }
    void validate()
    {
        String arr[]=text.split(" ");
        int len=arr[0].length();
        int count=0;
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i].length()==len)
                    count++;
            }
        try
            {
            if(count==arr.length)
                System.out.println("Valid Input Text");
            else
                throw new InvalidTextException("Invalid Text");
            }
        catch(InvalidTextException e)
            {
                System.out.println("Error: "+e.getMessage());
            }
    }
}
class SizeOfAllWords
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number of Text Cases");
            int num=sc.nextInt();
            StringValid s[]=new StringValid[num];
            for(int i=0;i<num;i++)
                {
                    s[i]=new StringValid();
                    s[i].read();
                    s[i].validate();
                }
        }
    }