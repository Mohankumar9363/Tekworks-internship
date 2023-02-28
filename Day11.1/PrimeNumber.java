//.Write a java program to check whether a number is Prime number or not
import java.util.Scanner;
class PrimeNumber{
  public static void main(String[] args){
    int count=0;
    Scanner obj=new Scanner(System.in);
    
    System.out.print("enter any number : ");
    int num=obj.nextInt();

    for(int i=1;i<=num;i++){
      if(num%i==0){
        count=count+1;
      }}
      if(count==2){
        System.out.println("prime number " );
      }
      else
        System.out.println(" not a prime number " );
    }
  
}