import java.util.*;
 
    class NestedTryPredefinedException{  
        
    public static void main(String a[])
    {
    try
      {
        int x=100;
        if(x<=10)
        throw new NullPointerException();
        else
        {
          try{
               throw new ArithmeticException();
            }
        catch(ArithmeticException e)
          {
            System.out.println(e);
          }
        }
      }
        catch(Exception e)
          {
            System.out.println(e);
          }
  }
    
  }
    