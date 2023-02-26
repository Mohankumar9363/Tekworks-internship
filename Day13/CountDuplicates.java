import java.util.Scanner;
class CountDuplicates
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
      int count=0;
    displayCountDuplicates(array,size,count);
    }
    public static void displayCountDuplicates(int array[],int size,int count)
    {
    
      for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]==array[j]){
              count++;   
              break;
        }
      }}
       System.out.println("no of Duplicates are:"+ count);

    }}