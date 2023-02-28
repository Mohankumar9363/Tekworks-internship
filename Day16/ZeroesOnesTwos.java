import java.util.Scanner;
class ZeroesOnesTwos
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array");
        int size =s.nextInt();
      int array[]=new int[size];
      System.out.println("enter elements in an array");
      for(int i=0;i<size;i++)
        {
          int j=s.nextInt();
          if(j==0||j==1||j==2)
            array[i]=j;
        }
    displayZeroesOnesTwos(array,size);
    }
      public static void displayZeroesOnesTwos(int arr[],int Size){
        int j = 0;
      int i=0;
        for ( i = 0; i <Size; i++) {
            if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                j++;
            }
        }
        j = Size-1;
        for ( i = Size-1; i >= 0; i--) {
            if (arr[i] ==1) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                j--;
            }
        }
      for(int h: arr)
         System.out.println(h);
        }}
      