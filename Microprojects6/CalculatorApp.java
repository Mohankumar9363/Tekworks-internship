/*Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.*/
import java.util.*;
 
class CalculatorApp {
  public static void main(String al[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any two numbers to perform arithmetc operations");
    int number1 = s.nextInt();
    int number2 = s.nextInt();
    
    char option;
    do {
      System.out.println("Arithemetic Operations");
      System.out.println("+: Addition");
      System.out.println("-: Substraction");
      System.out.println("*: Multiplication");
      System.out.println("/: Division");
      System.out.println("%: Modulo");
      System.out.println("Which arithemetic opeartion do you want to perform");
      char operators = s.next().charAt(0);
      CalculatorApp c=new CalculatorApp();
      switch (operators) {
        case '+':
           int addresult=c.addition(number1,number2);
          System.out.println(number1 + " + " + number2 + " = " + addresult);
          break;
        case '-':
         int subresult=c.substraction(number1,number2);
          System.out.println(number1 + " - " + number2 + " = " + subresult);
          break;
        case '*':
         int mulresult=c.multiplication(number1,number2);
          System.out.println(number1 + " * " + number2 + " = " + mulresult);
          break;
        case '/':
          c.division(number1,number2);
          break;
        case '%':
          c.modulo(number1,number2);
          break;
        default:
          System.out.println("Invalid operator!");
          break;
      }
      System.out.println("Do you want to perform one more opeartion");
      option = s.next().charAt(0);
    } while (option != 'n');
  }
 
int  addition(int num1,int num2)
  {
    return num1+num2;
  }
  int substraction(int number1,int number2)
  {
    return number1-number2;
  }
  int multiplication(int number1,int number2)
  {
        return number1*number2;
  }
    void division(int number1,int number2 )
  {
    try{
        if(number2!=0)
            System.out.println(number1/number2);
         else
             throw new Exception();
        }
      catch(Exception e){
          System.out.println("invalid Expression");
      }
}
void  modulo(int number1,int number2)
  {
      try{
        if(number2!=0)
            System.out.println(number1%number2);
         else
             throw new Exception();
        }
      catch(Exception e){
          System.out.println("invalid Expression");
      }
  }
  }