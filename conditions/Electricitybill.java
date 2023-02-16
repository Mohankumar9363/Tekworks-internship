import java.util.Scanner;
public class Electricitybill
  {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
      int unit=s.nextInt();
      double amount;
      if(unit<=50)
                  amount= unit*0.5 ;
             else if (unit<=150 && unit>50)
                  amount=unit*0.75;
             else if ( unit <=250 && unit>150)
                   amount=unit*1.20;
             else
                    amount=unit*1.50;
      double surcharge = amount*0.2;
      System.out.println(surcharge);
    }}