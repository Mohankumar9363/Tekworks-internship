import java.util.Scanner;
class DeleteElementPosition
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
    displayDeleteElementPosition(array,size);
      DisplayArrayElements( array, size);
    }
    public static void displayDeleteElementPosition(int array[],int size)
    {
      Scanner s=new Scanner(System.in);
        System.out.println("enter position number");  
         int position=s.nextInt();
        array[position]=0;
    }
    static void DisplayArrayElements(int array[],int size)
        {
        for(int h:array)
          System.out.println(h);
        }}