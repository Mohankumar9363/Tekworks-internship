class Threadclass extends Thread
  {
     public void run()
    {
      System.out.println("i am running thread");
    }
  }
 public class ThreadExample{
  public static void main(String h[])
  {
    Threadclass tc=new Threadclass();
    tc.start();
  }
}