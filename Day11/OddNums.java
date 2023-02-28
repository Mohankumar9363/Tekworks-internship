class OddNums {
  public static void main(String[] args) {
    OddNums.displayOddNums();
  }
  public static void displayOddNums()
  {
  for (int x=1;x<=100;x++)
    if (x%2!=0)
      System.out.println(x);
  }}