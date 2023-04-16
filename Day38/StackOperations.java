import java.util.*;
class StackOperations
  {
  public static void main(String args[]){
          Stack s=new Stack();
          s.push("abc");
          s.push("def");
          s.push("ghi");
          s.push("jkl");
          System.out.println("Stack list " + s);
          System.out.println(s.pop());
          System.out.println(s.search("chinnu"));
        }
  }