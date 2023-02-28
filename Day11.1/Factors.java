import java.util.Scanner;
class Factors
  {
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      System.out.print("enter any number : ");
      int num=obj.nextInt();
      for( int i=1;i<num;i++){
        if(num%i==0){
          System.out.println(" Factors " + i);
        }
      }
    }
  }