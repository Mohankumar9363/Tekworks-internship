import java.util.Scanner;
class ComparingTwoArrays
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array1");
        int size1 =s.nextInt();
      int array1[]=new int[size1];
      System.out.println("enter elements in an array1");
      for(int i=0;i<=size1-1;i++)
        array1[i]=s.nextInt();
      System.out.println("enter number of elements in an array2");
        int size2 =s.nextInt();
      int array2[]=new int[size2];
      System.out.println("enter elements in an array");
      for(int i=0;i<=size2-1;i++)
        array2[i]=s.nextInt();
    displayComparingTwoArrays(array1,size1,array2,size2);
    }
      public static void displayComparingTwoArrays(int array1[],int size1,int array2[],int size2){
        for (int i=0;i<size1;i++){
          for (int j=0;j<size1;j++){
            if(array1[i]==array2[j])
              System.out.println("commom element is:"+array1[i]);
            }
          }
        }}