interface I1
  {
    void display1();
  }
  interface I2
    {
      void display2();
    }
interface I3 extends I1,I2
  {
    void display3();
    
  }
class Sample implements I3
  {
    public  void display2()
    {
      System.out.println("2");
    }
   public   void display1()
    {
      System.out.println("1");
    }
    public  void display3()
    {
      System.out.println("3");
    }
  }
class MultipleInheritance
  {
    public static void main(String h[])
    {
      Sample s=new Sample();
      s.display1();
       s.display2();
       s.display3();
      
    }
  }