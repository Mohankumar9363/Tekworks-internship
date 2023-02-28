import java.util.Scanner;
class SumOfPrimeNumbers{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 System.out.println("enter lower digit"); 
int lower=sc.nextInt();
  System.out.println("enter upper digit");
int upper=sc.nextInt();
  int sum=0;
for(int n=lower; n<=upper; n++){
int c = 0;
for (int i = 1; i <= n; i++)
if (n % i == 0)
c++;
if (c == 2){
sum=sum+n;
}
  }System.out.println(sum);

    }
}