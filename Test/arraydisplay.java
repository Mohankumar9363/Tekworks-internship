//write an java program to give dynamic data to an array with set of positive ,negative ,zeroes 
import java.util.Scanner;
class ArrayDisplay
  {
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
      System.out.println("Enter No of elements");
      int Size=s.nextInt();
      int array[] =new int[Size];
      for(int i=0;i<Size;i++)
        array[i]=s.nextInt();
      displayDynamicarray(array,Size);
    }
    static void displayDynamicarray(int arr[],int Size)
    {
      int j = 0;
      int i=0;
        for ( i = 0; i <Size; i++) {
            if (arr[i] < 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                j++;
            }
        }
        j = Size-1;
        for ( i = Size-1; i >= 0; i--) {
            if (arr[i] > 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                j--;
            }
        }
      for(int h: arr)
         System.out.println(h);
        }}
              