import java.util.*;
class StringPermutation {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the data to String");
    String str = new String(sc.nextLine());
    char stringarray[] = str.toCharArray();
    displayStringPermutation(stringarray);
      }
  static void displayStringPermutation(char arr[]){
    for(char h:arr)
      System.out.println(h);
    for (int i=0;i<arr.length;i++){
      int j;
      for( j=i+1;j<arr.length-1;j++){
        char temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        for(char h:arr)
      System.out.println(h);
      char m=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=m;
      for(char h:arr)
      System.out.println(h);
      char mp=arr[j+1];
        arr[j+1]=arr[j-1];
        arr[j-1]=mp;
        for(char h:arr)
      System.out.println(h);
    }}
    
  }}