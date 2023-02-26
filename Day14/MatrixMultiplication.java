import java.util.*;
class MatrixMultiplication
  {
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
      int Firstmatrixrows, Firstmatrixcolumns, Secondmatrixrows, Secondmatrixcolumns,i,j;
      System.out.println("enter dimensions of FirstMatrix");
      Firstmatrixrows=s.nextInt();
      Firstmatrixcolumns=s.nextInt();
      System.out.println("enter dimensions of SecondtMatrix");
      Secondmatrixrows=s.nextInt();
      Secondmatrixcolumns=s.nextInt();
      
      // allocate memory formatrices
 
      int firtmatric[][]=new int[Firstmatrixrows][Firstmatrixcolumns];
      int secondmatric[][]=new int[Secondmatrixrows][Secondmatrixcolumns];
 
      
      System.out.println("Give data for FirstMatrix");
      for(i=0;i<Firstmatrixrows;i++)
        {
          for( j=0;j<Firstmatrixcolumns;j++)
            firtmatric[i][j]=s.nextInt();
        }
      System.out.println("Give data for SecondMatrix");
      for(i=0;i<Secondmatrixrows;i++)
        {
          for( j=0;j<Secondmatrixcolumns;j++)
           secondmatric[i][j]=s.nextInt();
        }
      mutilpication(firtmatric,Firstmatrixrows,Firstmatrixcolumns,secondmatric,Secondmatrixrows,Secondmatrixcolumns);
      
    }
    static void mutilpication(int f[][],int r1,int c1,int s[][],int r2,int c2)
    {
      int resultmatrix[][]=new int[r1][c2];
      if(c1==r2)
      {
      for(int i=0;i<r1;i++)
        {
          for(int j=0;j<c2;j++)
            {
              resultmatrix[i][j]=0;
              for(int k=0;k<c1;k++)
                resultmatrix[i][j]=resultmatrix[i][j]+f[i][k]*s[k][j];
            }
        }
        for(int i=0;i<r1;i++)
        {
          for(int j=0;j<c2;j++)
            {
              System.out.println(resultmatrix[i][j]+"\t");
            }
           System.out.println("\n");
        }
    }
      else
        System.out.println("multiplication not possible");
        
  }
  }