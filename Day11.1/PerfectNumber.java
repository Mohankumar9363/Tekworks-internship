import java.util.Scanner;
class PerfectNumber{
  public static void main(String[] args){
    
    Scanner obj=new Scanner(System.in);
    System.out.print("enter any number : " );
    int num=obj.nextInt();
    PerfectNumber.displayPerfectNumber(num);
  }
  public static void displayPerfectNumber(int num)
  {
    int sum=0;
    for(int i=1;i<num;i++){
      int rem=num%i;
      if(rem==0){
        sum=sum+i;
    }
    }
    if(num==sum)
      System.out.println("perfect number");
    else 
      System.out.println(" not a perfect number");
  }
}