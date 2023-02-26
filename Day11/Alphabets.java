class Alphabets
  {
  public static void main(String args[])
  {  
    char ch='a';
    Alphabets.displayAlphabets(ch);
  }
    public static void displayAlphabets(char ch)
    {
    while(ch<='z')
      {
        System.out.println(ch);
        ch++;
      }
  }}