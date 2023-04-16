import java.util.Scanner;

//create a class arrayTest have methods add() and TestElement() to read data and verify whether the given array element is prime number or not. If the number is not prime generate a custom
//exception. Test your application for any 5 different cases. Use an array of objects for the test cases. 
class InvalidArrayException extends Exception{
    InvalidArrayException(String msg)
    {
        super(msg);
    }
}
class ArrayTest
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
        void TestElement()
        {
            for(int i=0;i<arr.length;i++)
                {
                    int num=arr[i];
                    int count=0;
                    for(int j=1;j<=num;j++)
                        {
                            if(num%j==0)
                                count++;
                        }
                    try
                        {
                    if(count==2)
                        System.out.println("valid Element");
                    else
                        throw new InvalidArrayException("Invalid Element "+num);
                        }
                    catch(InvalidArrayException e)
                        {
                            System.err.println("Error: "+e.getMessage());
                        }
                }
        }
    }
class PrimeNumException
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter num of test cases");
            int num=sc.nextInt();
            ArrayTest a[]=new ArrayTest[num];
            for(int i=0;i<num;i++)
                {
                    a[i]=new ArrayTest();
                    a[i].read();
                    a[i].TestElement();
                }
        }
    }