import java.util.*;
class InsertionSort
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
    int size=sc.nextInt();
    System.out.println("Enter array elements");
    int array[]=new int[size];
    for(int i=0;i<size;i++)
      {
        array[i]=sc.nextInt();
      }
     displayInsertionSort(array,size);
    }
     static void displayInsertionSort(int array[],int size)
        {
            for(int i=1;i<array.length;i++)
                {
                    int temp=array[i];
                    int j;
                    for(j=i-1;j>=0&&(array[j]>temp);j--)
                        {
                                array[j+1]=array[j];
                        }
                    array[j+1]=temp;
                }
            for(int h:array)
                System.out.println(h);
        }
}