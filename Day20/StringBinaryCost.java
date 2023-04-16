import java.util.*;
class StringBinaryCost{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No of Test Cases");
    int t=sc.nextInt();
    while(t!=0){
    System.out.println("Enter the length of String");
    int len=sc.nextInt();
    System.out.println("Enter X cost in rupees");
    int x=sc.nextInt();
    System.out.println("Enter Y cost in rupees");
    int y=sc.nextInt();
    System.out.println("Enter the Binary numbers of length"+len);
    String bin=new String(sc.next());
    displayStringBinaryCost(bin,x,y);
    t--;    
  }}
  static void displayStringBinaryCost(String bin,int x,int y){
  int count=0;
  for(int i=0;i<bin.length();i++){
  if(bin.charAt(i)=='0')
    count++;
  }
if(count==bin.length())
  System.out.println("0");
else if(x<y)
{
  char ch[]=bin.toCharArray();
  for (int i = 0; i <ch.length; i++)   
        {  
        for (int j = i + 1; j < ch.length; j++)   
        {  
        char temp;  
        if (ch[i] > ch[j])   
        {  
        temp = ch[i];  
        ch[i] = ch[j];  
        ch[j] = temp;  
        }}  
        }
  String bin1=new String(ch);
  System.out.println(bin1);
  System.out.println(x);
}
  else{
  char ch1[]=bin.toCharArray();
  for (int i = 0; i <ch1.length; i++)   
        {  
        for (int j = i + 1; j < ch1.length; j++)   
        {  
        char temp;  
        if (ch1[i] < ch1[j])   
        {  
        temp = ch1[i];  
        ch1[i] = ch1[j];  
        ch1[j] = temp;  
        }}  
        }
  String bin2=new String(ch1);
  System.out.println(bin2);
  System.out.println(y);
}}}