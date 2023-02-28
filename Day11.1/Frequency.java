import java.util.Scanner;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      int num=s.nextInt();
    for(int i=0;i<=9;i++)   
      {        
     int count=0;            
      int temp=num;           
      while(temp>0)         
        {                
          int digit=temp%10;  
          if(digit==i)     
            {        
            count++; 
          }          
          temp=temp/10;   
        }        
      if(count>0)                
        System.out.println(i+"\t"+count);   
      }}}