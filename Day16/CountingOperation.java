import java.util.Scanner;
class CountingOperation
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
    displayNumType(array,size);
    displayEvenOrOdd(array,size);
    displayPrimeNum(array,size);
    }
    public static void displayNumType(int arr[],int size){
      int negative_count=0;
      int positive_count=0;
      int zero_count=0;
      for(int h:arr){
        if(h<0)
          negative_count++;
      else if(h>0)
          positive_count++;
      else
        zero_count++;  
      }
      System.out.println("No of negative numbers are:"+negative_count);
      System.out.println("No of positive numbers are:"+positive_count);
      System.out.println("No of zeroes are:"+zero_count);
    }
    public static void displayEvenOrOdd(int arr[],int size){
      int even_count=0;
      int odd_count=0;
      for(int h:arr){
        if(h%2==0)
          even_count++;
        else
          odd_count++;
      }
      System.out.println("No of even numbers are:"+even_count);
      System.out.println("No of odd numbers are:"+odd_count);
    }
   public static void displayPrimeNum(int arr[],int size){
     int prime_count=0;
     for(int h:arr){
       int count=0;
       for(int i=1;i<=h;i++){
         if(h%i==0)
           count++;
       }
       if(count==2){
         prime_count++; 
       System.out.println(h);
     }}
     System.out.println("No of Prime Numbers are:"+prime_count);
   }}