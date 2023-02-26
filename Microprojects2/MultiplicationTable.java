import java.util.Scanner;
class MultiplicationTable
  {
    public static void main(String rgs[])
    {
      char opt;
      do{
      Scanner s=new Scanner(System.in);
      System.out.println("enter number for Table");
      int n=s.nextInt();
      displayMultiplicationTable(n);
        System.out.println("Do You want to do one more operation(y/n)");
        opt=s.next().charAt(0);
    }while(opt!='n');
    }
    public static void displayMultiplicationTable(int n)
    {
        for(int i = 1; i <= 10; ++i)
        {
            System.out.println(n * i);
        }
    }
    }