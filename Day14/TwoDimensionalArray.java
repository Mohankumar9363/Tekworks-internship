import java.util.Scanner;
class TwoDimensionalArray
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter size of rows in an array");
        int rows =s.nextInt();
      System.out.println("enter size of columns in an array");
        int columns =s.nextInt();
      int array[][]=new int[rows][columns];
      System.out.println("enter elements in an array");
      for(int i=0;i<rows;i++)
              for(int j=0;j<columns;j++)        
        array[i][j]=s.nextInt();
    displayDynamicArray(array,rows,columns);
    }
     public static void displayDynamicArray(int Td[][],int n1,int n2)
    {
      for(int i=0;i<n1;i++)
              for(int j=0;j<n2;j++)   
          System.out.println(Td[i][j]);
    }
  }