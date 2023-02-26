import java.util.Scanner;
class InsertElementAtPosition
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
    displayInsertElementAtPosition(array,size);
      DisplayArrayElements( array, size);
    }
    public static void displayInsertElementAtPosition(int array[],int size)
    {
      Scanner s=new Scanner(System.in);
        System.out.println("enter position number");  
         int position=s.nextInt();
        System.out.println("enter element for inserting in Specified index");  
         array[position]=s.nextInt();
        }
    static void DisplayArrayElements(int array[],int size)
        {
        for(int h:array)
          System.out.println(h);
        }}














