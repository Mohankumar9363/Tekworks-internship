import java.util.*;
class SelectionSort
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
     displaySelectionSort(array,size);
    }
     static void displaySelectionSort(int array[],int size)
        {
            int min=0;
            for(int i=0;i<array.length;i++)
                {
                    for(int j=i+1;j<size;j++)
                    if(array[i]>array[j])
                    {
                        min=array[i];
                        array[i]=array[j];
                        array[j]=min;
                    }
                    }
            for(int h:array)
             System.out.println(h);
        }
    
}