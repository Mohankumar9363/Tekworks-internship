class Ascii
  {
    public static void main(String args[])
    {
      Ascii.displayAscii();
    }
    public static void displayAscii()
    {
      for (int i=33;i<123;i++)
    System.out.println("Ascii value of"+ " "+ (char)i+" "+"is"+" "+ i);
    
    }
  }