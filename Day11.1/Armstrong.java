import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
        int number = s.nextInt();
      displayArmstrong(number);
    }
   public static void displayArmstrong(int number)
  {
        double result = 0;
        int temp = number;

        while (temp != 0)
        {
            int rem =temp % 10;
            result =result + Math.pow(rem, 3);
            temp /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}