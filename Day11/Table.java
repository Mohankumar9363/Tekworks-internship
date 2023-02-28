import java.util.Scanner;
class Table
  {
    public static void main(String rgs[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter n");
      int n=s.nextInt();
      Table.displayTable(n);
    }
    public static void displayTable(int n)
    {
        for(int i = 1; i <= 10; ++i)
        {
            System.out.println(n * i);
        }
    }
    }