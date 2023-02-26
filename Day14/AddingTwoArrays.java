import java.util.Scanner;
class AddingTwoArrays
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("read the dimensions of firstarray");
            System.out.println("enter size of rows in an firstarray");

        int firstrows =s.nextInt();
      System.out.println("enter size of columns in an firstarray");
        int firstcolumns =s.nextInt();
      int firstarray[][]=new int[firstrows][firstcolumns];
      System.out.println("enter elements in an firstarray");
      for(int i=0;i<firstrows;i++)
              for(int j=0;j<firstcolumns;j++)        
        firstarray[i][j]=s.nextInt();
      System.out.println("read the dimensions of secondarray");
                  System.out.println("enter size of rows in an secondarray");

        int secondrows =s.nextInt();
      System.out.println("enter size of columns in an secondarray");
        int secondcolumns =s.nextInt();
      int secondarray[][]=new int[secondrows][secondcolumns];
      System.out.println("enter elements in an secondarray");
      for(int i=0;i<secondrows;i++)
              for(int j=0;j<secondcolumns;j++)        
        secondarray[i][j]=s.nextInt();
    displayDynamicArray(firstarray,firstrows,firstcolumns,secondarray,secondrows,secondcolumns);
    }
     public static void displayDynamicArray(int firstarray[][],int firstrows,int firstcolumns,int secondarray[][],int secondrows,int secondcolumns)
    {
      int ResultArray[][]=new int[firstrows][firstcolumns];
      if(firstrows==secondrows && firstcolumns== secondcolumns){
        int j=0;
      for(int i=0;i<firstrows;i++){
              for( j=0;j<firstcolumns;j++)  
              ResultArray[i][j]=firstarray[i][j]+secondarray[i][j];
    }
        for(int i=0;i<firstrows;i++){
              for( j=0;j<firstcolumns;j++)  
                System.out.println(ResultArray[i][j]);
  }}}}