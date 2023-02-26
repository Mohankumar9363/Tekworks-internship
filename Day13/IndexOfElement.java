import java.util.Scanner;
class IndexOfElement
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
    displayIndexOfElement(array,size);
    }
    public static void displayIndexOfElement(int array[],int size)
    {
      Scanner s=new Scanner(System.in);
        System.out.println("enter the element to search for index");
        int element=s.nextInt();
      for(int i=0;i<size;i++)
        {
          if(array[i]==element)
            System.out.println("index of"+element+"is "+i);
            
        }
    }}