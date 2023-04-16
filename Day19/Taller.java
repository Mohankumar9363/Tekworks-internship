import java.util.*;
class Taller{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of test cases");
    int num=sc.nextInt();
    displayTaller(num);
  }
  static void displayTaller(int num){
    for (int i=0;i<num;i++){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the height of x");
      String x=new String(sc.next());
      System.out.println("enter the height of y");
      String y=new String(sc.next());
      int num1=Integer.parseInt(x);
      int num2=Integer.parseInt(y);
      if(num1>num2){
        System.out.println("A");
      }
      else
                System.out.println("B");

      
    }
  }
  }
