import java.util.Scanner;
class alphabet {
  public static void main(String[] args) {
  char x;
  Scanner s = new Scanner(System.in);
    x=s.next().charAt(0);
    if((x>='a' && x<='z')||(x>='A' && x<='Z'))
      System.out.println("given char is a alphabet");
    else
      System.out.println("given char is not a alphabet");
  }}