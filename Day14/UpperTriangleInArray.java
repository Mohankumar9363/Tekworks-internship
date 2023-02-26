import java.util.Scanner;
class UpperTriangleInArray
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
    displayUpperTriangleInArray(array,rows,columns);
    }
    public static void displayUpperTriangleInArray(int a[][],int r,int c)
    {
      for(int i=0;i<r;i++){
              for(int j=i;j<c;j++) {
                System.out.println(a[i][j]);
              }}
                
    }}