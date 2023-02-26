import java.util.*;
 
class Calculator {
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
      Calculator c=new Calculator();
      switch (operators) {
 
        // performs addition between numbers
        case '+':
           int addresult=c.addition(number1,number2);
          System.out.println(number1 + " + " + number2 + " = " + addresult);
          break;
 
        // performs subtraction between numbers
        case '-':
         int subresult=c.substraction(number1,number2);
          System.out.println(number1 + " - " + number2 + " = " + subresult);
          break;
 
        // performs multiplication between numbers
        case '*':
         int mulresult=c.multiplication(number1,number2);
          System.out.println(number1 + " * " + number2 + " = " + mulresult);
          break;
 
        // performs division between numbers
        case '/':
          int divresult=c.division(number1,number2);
          System.out.println(number1 + " / " + number2 + " = " + divresult);
          break;
        case '%':
          int modresult=c.modulo(number1,number2);
          System.out.println(number1 + " % " + number2 + " = " + modresult);
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
int  modulo(int number1,int number2)
  {
        return number1%number2;
  }
  int division(int number1,int number2 )
  {
    return number1/number2;
  }
}