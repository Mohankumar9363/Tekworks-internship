import java.util.*; 
class CustomExceptionExample {
  public static void main(String a[]) throws NullPointerException,ArithmeticException, IllegalArgumentException
  {
    Scanner p=new Scanner(System.in);
    System.out.println("enter any number");
    int f=p.nextInt();
    if(f<0)
      throw new ArithmeticException();
    else if(f==0)
      throw new IllegalArgumentException();
    else
      throw new NullPointerException();
    }
 
}