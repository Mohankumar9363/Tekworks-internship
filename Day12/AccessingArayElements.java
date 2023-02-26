class AccessingArayElements
  {
    public static void main(String args[])
    {
      int staticarray[]={1,2,3,4};
      Array.displayArray(staticarray,4);
      
    }
    public static void displayArray(int sa[],int n1)
    {
      for(int i=0;i<sa.length;i++)
          System.out.println(sa[i]);
    }
  }
