class EvenNums {
  public static void main(String[] args) {
    EvenNums.displayEvenNums();
  }
  public static void displayEvenNums()
  {
  for (int x=1;x<=100;x++)
    if (x%2==0)
      System.out.println(x);
  }}