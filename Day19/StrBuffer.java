import java.util.*;

class StrBuffer {
  public static void display(String s1) {    
    StringBuffer sb = new StringBuffer(s1);
    System.out.println(sb);
    System.out.println(sb.append("hello"));
    System.out.println(sb.delete(1, 3));
    System.out.println(sb.insert(2, "hi"));
    System.out.println(sb.reverse());
    System.out.println(sb.replace(0, 2, "hello"));
  }

  public static void main(String[] ar) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the string:");
    String st=s.next();
    
    display(st);
  }
}