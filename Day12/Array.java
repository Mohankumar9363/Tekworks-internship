class Array
  {
    public static void main(String args[])
    {
      int staticarray[]={1,2,3,4};
      int dynamicarray[]=new int[10];
      Array.displayArray(staticarray,4,dynamicarray,10);
      
    }
    public static void displayArray(int sa[],int n1,int da[],int n2)
    {
      System.out.println(sa[2]);
     System.out.println(da[2]);
    }
  }
