// using runnable interfcae 
class Threadclass extends Thread
  {
   public  void run()
    {
    
      for(int i=0;i<3;i++)
        {
         System.out.println(i);
        try{
      Thread.sleep(2000);
        }
      catch(Exception t1)
          {
          System.out.println(t1);
          }
        }
     
    }
  }
public class MultithraedingExample{
  public static void main(String h[])
  {
   
    Threadclass tc=new Threadclass();
   // tc.run();
    Thread t1=new Thread(tc);
    t1.start();
   
    
    Thread t2=new Thread(tc);
    t2.start();
    
    Thread t3=new Thread(tc);
    t3.start();
    
  
  }
}