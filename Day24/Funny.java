import java.util.*;
class Funny{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of test cases");
   int num=s.nextInt();
    int l=0;
    while(l<num){
    System.out.println("give data to the String");
    String str=new String(s.nextLine());
    int arr[]=new int[str.length()];
    int arr1[]=new int[str.length()];
    display(str,arr,arr1);
   l++;
  }}
  
   static void display(String str,int arr[],int arr1[]){
    for(int i=0;i<str.length()-1;i++){
      arr[i]=-(str.charAt(i)-str.charAt(i+1));
    }
   for(int i=str.length()-1;i>0;i--){
     arr1[(str.length()-1)-i]=(str.charAt(i)-str.charAt(i-1));
    }
    int count=0;
    for(int i=1;i<arr.length;i++)
    {
    if(arr[i]==arr1[i])
      count++;
    }
    if(count==arr.length-1)
      System.out.println("funny");
    else
      System.out.println("Not funny");
  }
}
