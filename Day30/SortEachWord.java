//Create a class called wrodString having read() and sort() to take data and sort each word separately. Generate a custom exception if the user has given any empty string as input. Test your application for any 4 different text inputs.
import java.util.*;
class InvalidTextException extends Exception
    {
        InvalidTextException(String msg)
        {
            super(msg);
        }
    }
class WordString
    {
        String text;
        void read()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter text");
            text=sc.nextLine();
        }
        void sort()
        {
           try
                {
            if(text.equals(""))
                throw new InvalidTextException("Invalid Text");
                }
            catch(InvalidTextException e)
                {
                    System.out.println("Error: "+e.getMessage());
                }
            String str[]=text.split(" ");
            for(int i=0;i<str.length;i++)
                {
                    String word=str[i];
                    char word1[]=word.toCharArray();
                    for(int j=0;j<word1.length;j++)
                        {
                            for(int k=i+1;k<word1.length;k++)
                                {
                                    if(word1[i]>word1[j])
                                    {
                                        char temp=word1[j];
                                        word1[j]=word1[i];
                                        word1[i]=temp;
                                    }
                                }
                        }
                    for(char h:word1)
                            System.out.print(h);
                           System.out.println();
                }
        }
    }
class SortEachWord
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of Text Cases");
            int num=sc.nextInt();
            WordString w[]=new WordString[num];
            for(int i=0;i<num;i++)
                {
                    w[i]=new WordString();
                    w[i].read();
                    w[i].sort();
                }
        }
    }