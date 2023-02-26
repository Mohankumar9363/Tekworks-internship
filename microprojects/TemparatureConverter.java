import java.util.Scanner;
class TemparatureConverter{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    char option;
    do{
    System.out.println("Enter  value:");
    double val = sc.nextDouble();
    System.out.println("1. Celcius to Fahrenheit"+  "2. Celcius to Kelvin"+"3. Fahrenheit to Celcius" +  "4. Fahrenheit to Kelvin"
                        +"5. Kelvin to Celcius"+  "6. Kelvin to Fahrenheit" +   "7. Exit");
    
      System.out.println("Enter Choice: ");
      int ch = sc.nextInt();
        switch(ch)
        {
        case 1: double f = (val * 9/5) + 32;
                System.out.println("Fahrenheit is"+ f);
                break;
        case 2:  double k = val+273.5;
    
                System.out.println("Kelvin is"+ k );
            break;
        case 3:  double C = (val - 32) * 5/9;
            System.out.println("Celcius is"+ C );
            break;
        case 4: double K = (val - 32) * 5/9 + 273.15;
             System.out.println("Kelvin is"+ K );
            break;
        case 5: double c = val - 273.15;
             System.out.println("Celcius is"+ c );
            break;
        case 6: double F = (val - 273.15) * 9/5 + 32;
             System.out.println("Fahrenheit is"+ F );
            break;
        default :
              System.out.println("Invalid Input");
        }System.out.println("Do you want to calculate again");
      option = sc.next().charAt(0);
    } while (option != 'n');

  }
}
  



