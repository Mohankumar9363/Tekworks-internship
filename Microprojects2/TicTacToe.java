import java.util.*;
class TicTacToe
  {
    public static void main (String args[])
    {
int arr[][] =  { { 2, 2 ,2}, { 2, 2,2}, { 2, 2,2} };
      for(int k=1;k!=0;k++){
      Scanner s=new Scanner(System.in);
      Random r=new  Random();
       System.out.println("enter row number and column number");
       while (true){
        int row1=s.nextInt();
      int column1=s.nextInt();
        if(arr[row1][column1]!=1){
            arr[row1][column1]=0;
            break;
        }}
      
      for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)
            {
              System.out.print(arr[i][j]+"\t");
            }
           System.out.println("\n");
        }
        
      while (true){
        int row=r.nextInt(3);
        int column=r.nextInt(3);
        if(arr[row][column]!=0){
            arr[row][column]=1;
            break;
        }}
for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr.length;j++)
            {
              System.out.print(arr[i][j]+"\t");
            }
           System.out.println("\n");
        }
     
    
        
        if (arr[0][0]==0&&arr[0][1]==0&&arr[0][2]==0)
          System.out.println("player wins");
        else if (arr[1][0]==0&&arr[1][1]==0&&arr[1][2]==0)
          System.out.println("player wins");
        else if (arr[2][0]==0&&arr[2][1]==0&&arr[2][2]==0)
          System.out.println("player wins");
        else if (arr[0][0]==0&&arr[1][0]==0&&arr[2][0]==0)
          System.out.println("player wins");
        else if (arr[0][1]==0&&arr[1][1]==0&&arr[2][1]==0)
          System.out.println("player wins");
        else if (arr[0][2]==0&&arr[1][2]==0&&arr[2][2]==0)
          System.out.println("player wins");
        else if (arr[0][0]==0&&arr[1][1]==0&&arr[2][2]==0)
          System.out.println("player wins");
        else if (arr[0][2]==0&&arr[1][1]==0&arr[2][0]==0)
          System.out.println("player wins");
      else if (arr[0][0]==1&&arr[0][1]==1&&arr[0][2]==1)
          System.out.println("player lose");
        else if (arr[1][0]==1&&arr[1][1]==1&&arr[1][2]==1)
          System.out.println("player lose");
        else if (arr[2][0]==1&&arr[2][1]==1&&arr[2][2]==1)
          System.out.println("player lose");
        else if (arr[0][0]==1&&arr[1][0]==1&&arr[2][0]==1)
          System.out.println("player lose");
        else if (arr[0][1]==1&&arr[1][1]==1&&arr[2][1]==1)
          System.out.println("player lose");
        else if (arr[0][2]==1&&arr[1][2]==1&&arr[2][2]==1)
          System.out.println("player lose");
        else if (arr[0][0]==1&&arr[1][1]==1&&arr[2][2]==1)
          System.out.println("player lose");
        else if (arr[0][2]==1&&arr[1][1]==1&arr[2][0]==1)
          System.out.println("player lose");  
      }
        }}