import java.util.Scanner;
class vowelconsonant {
  public static void main(String[] args) {
    int a;

    Scanner s = new Scanner(System.in);
    a=s.next().charAt(0);
    if (a=='a' || a=='e' || a =='i'|| a=='o'||a =='u')
      System.out.println("it is a vowel");
    else
      System.out.println("it is a consonant");
  }
}