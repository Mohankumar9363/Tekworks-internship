import java.util.Scanner;
class NegativeNumbersArray
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
    displayNegativeNumbersArray(array,size);
    }
    public static void displayNegativeNumbersArray(int array[],int size)
    {
      int count=0;
      for(int h:array)
          {
           if(h<0)
              count++;   
          }
      System.out.println("negative numbers_count is" +count);
    }}