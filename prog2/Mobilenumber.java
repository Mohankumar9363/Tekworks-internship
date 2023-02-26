import java.util.*;
class Mobilenumber  {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the mobile Number");
    long Mob_num = sc.nextLong();
    int count = 0;
    while ( Mob_num!=0) {
      long digit = Mob_num % 10;
      Mob_num = Mob_num  / 10;
      count += 1;
    }
    if(count==10)
      System.out.println("your Mobile Number is valid");
    else
      System.out.println("your Mobile Number is not valid .please enter 10 digits");
    
  }}