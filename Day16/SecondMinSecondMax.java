import java.util.Scanner;
class SecondMinSecondMax
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
    displaySecondMinSecondMax(array,size);
    }
    public static void displaySecondMinSecondMax(int arr[],int size)
    {
      for(int i=0;i<size;i++)
        {
          for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
          }
        }
      System.out.println("The Second Minimum Number is:"+arr[1]);
      System.out.println("The Second Maximum Number is:"+arr[size-2]);

    }}
    