import java.util.Scanner;
class DeleteElement
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
    displayDeleteElement(array,size);
      DisplayArrayElements( array, size);
    }
    public static void displayDeleteElement(int array[],int size)
    {
      Scanner s=new Scanner(System.in);
        System.out.println("enter the element to remove from array");
        int remove=s.nextInt();
        int i;
        for(i=0;i<size;i++)     
        {
          if(array[i]==remove)
            array[i]=0;
        }
        if(i==size)
          System.out.println("element is not found");
        }
    static void DisplayArrayElements(int array[],int size)
        {
        for(int h:array)
          System.out.println(h);
        }}