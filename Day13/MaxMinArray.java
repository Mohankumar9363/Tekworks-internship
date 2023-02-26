import java.util.Scanner;
class MaxMinArray
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array");
        int size =s.nextInt();
      int array[]=new int[size];
      System.out.println("enter elements in an array");
      for(int i=0;i<=size-1;i++)
        array[i]=s.nextInt();
    displayMaxMinArray(array,size);
    }
    public static void displayMaxMinArray(int array[],int size)
    {
      int maximum=array[0];
      int minimum=array[0];
      for(int i=1;i<array.length;i++)
        {
          if(maximum<i)
            maximum=array[i];
          else if(minimum>i)
            minimum=array[i];
        }
      System.out.println("maximum is"+ maximum);
      System.out.println("minimum is"+ minimum);
    }}