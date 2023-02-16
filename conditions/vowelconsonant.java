import java.util.Scanner;
public class vowelconsonant
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      char x=s.next().charAt(0);
      switch(x){
        case 'a':
            System.out.println("it is vowel");
            break;
        case 'e':
            System.out.println("it is vowel");
            break;
            case 'i':
            System.out.println("it is vowel");
            break;
            case '0':
            System.out.println("it is vowel");
            break;
            case 'u':
            System.out.println("it is vowel");
          break;
          default: 
                 System.out.println("it is a consonant");
        }}}