import java.util.Scanner;
class AlternateElements1
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
    displayAlternateElements1(array,size);
    }
     public static void displayAlternateElements1(int a[],int n1)
    {
      for(int l=1;l<a.length;l=l+2)
          System.out.println(a[l]);
    }
  }