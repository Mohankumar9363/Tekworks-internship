//Create class Palindrome having methods add() and palindrome() to take data and verify whether the given number is palindrome or not. If the number is not palindrome generate a custom exception. Test your code for any 5 different numbers.
import java.util.*;
class InvalidArrayException extends Exception{
    InvalidArrayException(String msg)
    {
        super(msg);
    }
}
class Palindrome
    {
        int arr[];
        void read()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of elements in an array");
            int size=sc.nextInt();
            arr=new int[size];
            System.out.println("Enter elements");
            for(int i=0;i<arr.length;i++)
                    arr[i]=sc.nextInt();              
        }
        void palindrome()
        {
        for(int i=0;i<arr.length;i++)
            {
                int rev=0;
                int num=arr[i];
                while(arr[i]!=0)
                {
                int rem=arr[i]%10;
                rev=(rev*10)+rem;
                arr[i]=arr[i]/10;
                }
                String num1=Integer.toString(num);
                try{
                if(num==rev&&num1.length()>=2)
                   System.out.println("Valid Element: "+num);
                else
                  throw new InvalidArrayException("Invalid Element: "+num);
                }
                catch(InvalidArrayException e)
                    {
                        System.out.println("Error: "+e.getMessage());
                    }
            }
        }
    }
class PalindromeElement
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num of test cases");
            int num=sc.nextInt();
            Palindrome a[]=new Palindrome[num];
            for(int i=0;i<num;i++)
                {
                    a[i]=new Palindrome();
                    a[i].read();
                    a[i].palindrome();
                }
        }
    }
