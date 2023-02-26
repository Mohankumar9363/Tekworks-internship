import java.util.Scanner;
class FrequencyOfElementsArray
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
    displayFrequencyOfElementsArray(array,size);
    }
    public static void displayFrequencyOfElementsArray(int array[],int size)
    {
      int c;
      for(int i=0;i<array.length;i++){
        c=1;
        for(int j=i+1;j<array.length;j++){
            if(array[i]==array[j])
              c++;   
        }
        System.out.println(array[i]+""+c);
      }
    }}