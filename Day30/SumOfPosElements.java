//Create class ArrayExample having read() and sum() to read data and add array elements in case the array element is +ve, if not generate a custom exception. Test your application for any 5 different scenarios. Use an array of objects for the test cases.
import java.util.*;
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
        void sum()
        {
            for(int i=0;i<arr.length;i++)
                {
                    try{
                    if(arr[i]<0) 
                        throw new InvalidArrayException("Invalid Element"+arr[i]);
                    }
                    catch(InvalidArrayException e)
                        {
                            System.out.println("Error: "+e.getMessage());
                        }
                }
            int sum=0;
            for(int h:arr)
                {
                    if(h>0)
                        sum=sum+h;
                }
            System.out.println("Sum of positive elements is "+sum);
        }
    }
class SumOfPosElements
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
                    a[i].sum();
                }
        }
    }