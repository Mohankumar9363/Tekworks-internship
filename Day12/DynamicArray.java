import java.util.Scanner;
class DynamicArray
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array");
        int size =s.nextInt();
      int amount[]=new int[size];
      System.out.println("enter elements in an array");
      for(int i=0;i<=size-1;i++)
        amount[i]=s.nextInt();
    displayDynamicArray(amount,size);
    }
     public static void displayDynamicArray(int da[],int n1)
    {
      for(int l=0;l<da.length;l++)
          System.out.println(da[l]);
    }
  }