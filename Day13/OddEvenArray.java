import java.util.Scanner;
class OddEvenArray
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
    displayOddEvenArray(array,size);
    }
    public static void displayOddEvenArray(int array[],int size)
    {
      int even_count=0;
      int odd_count=0;

      for(int h:array)
          {
           if(h%2==0)
              even_count++;
           else
              odd_count++;      
          }
      System.out.println("even_count is" +even_count);
      System.out.println("odd_count is"+odd_count);
    }}