import java.util.Scanner;
public class AllArmstrongNumbers{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
        int number = s.nextInt();
      displayAllArmstrongNumbers(number);
    }
   public static void displayAllArmstrongNumbers(int number)
  {
    for(int i=1;i<=number;i++){
        double result = 0;
        int temp = i;

        while (temp != 0)
        {
            int rem =temp % 10;
            result =result + Math.pow(rem, 3);
            temp /= 10;
        }

        if(result == i)
            System.out.println(i + " is an Armstrong number.");
        //else
          //  System.out.println(number + " is not an Armstrong number.");
    }}
}