import java.util.Scanner;
class AlphabetAscii
  {
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the alphabet");
    char ch= s.next().charAt(0);
    System.out.println("Ascii value of"+ ch+"is"+ (int)ch);
    
    }
  }