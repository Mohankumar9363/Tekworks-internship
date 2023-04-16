import java.util.*;
class BinarySearch
  {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array size");
int size=sc.nextInt();
System.out.println("Enter array elements");
int array[]=new int[size];
for(int i=0;i<size;i++)
  {
    array[i]=sc.nextInt();
  }
      Arrays.sort(array);
      int first=0;
      int last=array.length-1;
      int loc=-1;
      System.out.println("Enter search element");
      int key=sc.nextInt();
      displayBinarySearch(array,first,last,key,loc);
    }
    static void displayBinarySearch(int array[],int first,int last,int key,int loc)
    {
        int mid=-1;
      while(first<=last)
        {
         mid=(first+last)/2;
          if(key==array[mid]){
            loc=mid;
            break;
          }
          else if(key<array[mid]){
            last=mid-1;
          }
          else {
            first=mid+1;       
          }
      }
      if(loc==-1)
        System.out.println("not found");
      else 
        System.out.println(mid);
    }
  }