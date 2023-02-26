import java.util.*;

 class FourDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mobile Number");
    long Mob_num = sc.nextLong();
    int i = 0;
    while (i < 4) {
      long digit = Mob_num % 10;
      Mob_num = Mob_num  / 10;
      System.out.println(digit);
      i += 1;
    }
  }
}