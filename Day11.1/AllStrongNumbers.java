import java.util.Scanner;
public class AllStrongNumbers {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
        int num = s.nextInt();
      for(int j=1;j<=num;j++){
      int temp=j;
      int sum=0;
      while(j>0)
        {
          int rem=j%10;
          int fact=1;
          for(int i=1;i<=rem;i++){
            fact=fact*i;
          }
          sum=sum+fact;
          j/=10;
        }
      if(sum==temp)
      System.out.println(temp +"is a strong number");
    }}}