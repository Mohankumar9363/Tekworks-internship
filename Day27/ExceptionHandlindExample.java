import java.util.*;
class ExceptionHandlindExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        try{
            System.out.println(x/y);
        }
        catch(Exception e)//e is reference for type exception
            {
            System.out.println(e);
        }
        System.out.println("program execution completed");
    }
}