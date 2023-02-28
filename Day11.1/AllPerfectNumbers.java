import java.util.Scanner;
class AllPerfectNumbers{
  public static void main(String[] args){
    
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any number : " );
    int num=obj.nextInt();
    displayAllPerfectNumbers(num);
  }
  public static void displayAllPerfectNumbers(int num)
  {
    for(int i=1;i<=num;i++){
    int sum=0;
    for(int j=1;j<i;j++){
      int rem=i%j;
      if(rem==0){
        sum=sum+j;
    }
    }
    if(i==sum)
      System.out.println(i +"is perfect number");
  }
}}