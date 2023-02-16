import java.util.Scanner;
class calculator
  {
    public static void main(String args[])
    {
      float x,y ,op;
      char ch;
      Scanner s=new Scanner(System.in);
      ch=' ';
      while(ch!='n')
        { 
      System.out.println("enter ch");
      ch=s.next().charAt(0);

      switch (ch)
        {
          case '+':
            System.out.println("enter two numbers");
            x= s.nextFloat();
            y=s.nextFloat();
            op=x+y;
            System.out.println(op);
            break;
            case '-':
            System.out.println("enter two numbers");
            x= s.nextFloat();
            y=s.nextFloat();
            op=x-y;
            System.out.println(op);
            break;
            case '*':
            System.out.println("enter two numbers");
            x= s.nextFloat();
            y=s.nextFloat();
            op=x*y;
            System.out.println(op);
            break;
            case '%':
            System.out.println("enter two numbers");
            x= s.nextFloat();
            y=s.nextFloat();
            op=x%y;
            System.out.println(op);
            break;
            case '/':
            System.out.println("enter two numbers");
             x= s.nextFloat();
            y=s.nextFloat();
            op=x/y;
            System.out.println(op);
            break;
        }
      
        
      
        }
  }
  }