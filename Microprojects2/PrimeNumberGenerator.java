import java.util.*;
class PrimeNumberGenerator{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
  System.out.println("enter a  number : ");
int num=sc.nextInt();
  System.out.println("enter a lower number : ");
int num=sc.nextInt();
  System.out.println("enter a upper number : ");
int num=sc.nextInt();
  int primenum[]=new int[num];
  int j=0;
for(int n=2; n<num; n++){
int count = 0;
for (int i = 1; i <= n; i++)
if (n % i == 0)
count=count+1;
if (count == 2){
  newarr[j]=n;
  j++;
}
  }
  System.out.println(Arrays.toString(newarr));
}
}