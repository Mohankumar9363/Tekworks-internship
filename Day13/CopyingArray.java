import java.util.Scanner;
class CopyingArray
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
      displayCopiedArray(array,size);
    }
    public static void displayCopiedArray(int array[],int size)
    {
      int array1[]=new int[size];
      for(int i=0;i<=size-1;i++)
        array1[i]=array[i];
      for(int i=0;i<=size-1;i++)
        System.out.println(array1[i]);
    }}