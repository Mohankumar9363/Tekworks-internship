import java.util.Scanner;
class Fibonacci{  
public static void main(String args[])  
{    
 int a=0,b=1;
  int c;
  Scanner s=new Scanner(System.in);
  System.out.println("enter n");
  int n=s.nextInt();
 System.out.print(a+" "+b);     
 for(int i=2;i<n;i++)   
 {    
  c=a+b;      
  a=b;    
  b=c;   
  System.out.print(" "+c);  
 }    
  
}}  