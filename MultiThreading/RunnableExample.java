class Runnableclass implements Runnable
  {
     public void run()
    {
      System.out.println("i am running thread");
    }
  }
 public class RunnableExample{
  public static void main(String h[])
  {
    Threadclass tc=new Threadclass();
    tc.run();
    Thread t=new Thread(tc);
    t.start();
  }
}