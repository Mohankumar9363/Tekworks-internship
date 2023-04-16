/*Create an interface “Number” with the following abstract methods isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), and isAmstrong() the above methods return boolean primitive type. Implement this interface in the “Verification” class.*/
import java.util.*;
interface Number{
  String isZero(int num);
  String isPositive(int num);
  String isNegative(int num);
  String isOdd(int num);
  String isEven(int num);
  String isPrime(int num);
 String isArmstrong(int num);
}
class Verification implements Number{
  public String isZero(int num){
    if(num==0)
      return "number is zero";
      else
        return "number is non zero";
  }
  public String isPositive(int num){
    if(num>0)
      return "number is positive";
      else
          return "number is not positive";
  }
  public String isNegative(int num){
    if(num<0)
      return "number is negative";
      else
          return "number is not negative";
  }
  public String isOdd(int num){
    if(num%2!=0)
      return "number is odd";
      else
        return "number is not odd";
  }
  public  String isEven(int num){
    if(num%2==0)
      return "number is even";
      else
          return "number is not even";
  }
  public String isPrime(int num){
    int count=0;
    for(int i=1;i<num;i++){
      if(num%i==0)
        count++;
    }
    if(count==1)
      return "number is prime";
      else
          return "number is not prime";
  }
 public String isArmstrong(int num){
    double result = 0;
    int temp = num;

    while (temp != 0)
    {
        int rem =temp % 10;
        result =result + Math.pow(rem, 3);
        temp /= 10;
    }

    if(result == num)
        return  "number  is an Armstrong number.";
    else
        return "number is not an Armstrong number.";
    
  }
}
    class NumberType
    {
        public static void main(String args[]){
            Verification v=new Verification();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number");
            int num=sc.nextInt();
            System.out.println(v.isZero(num));
            System.out.println(v.isPositive(num));
            System.out.println(v.isNegative(num));
            System.out.println(v.isOdd(num));
            System.out.println(v.isEven(num));
            System.out.println(v.isPrime(num));
            System.out.println(v.isArmstrong(num));
        
    }
}