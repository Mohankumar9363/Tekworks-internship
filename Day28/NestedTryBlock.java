import java.util.*;
class Atmpinwrong extends Exception
{
    Atmpinwrong(String message)
    {
    super(message);
    }
}
 
class ATMPin
{
    String pin;
    ATMPin(String pin)
    {
        this.pin=pin;
    }
    void verify() throws Atmpinwrong
    {
        try
        {
            if(pin.length()!=4)
                throw new Atmpinwrong("invalid number of charcaters");
            else
            {
                try
                {
                    int count=0;
                    for(int i=0;i<4;i++)
                    {
                        if(pin.charAt(i)>='0'&&pin.charAt(i)<='9')
                        count++;
                    }
                    if(count!=4)
                    throw new Atmpinwrong("Invalid charater sets");
          else
            System.out.println("valid format");
                }
                catch(Atmpinwrong a)
                {
                    System.out.println(a.getMessage());
                }
            }
        }
 
        catch(Atmpinwrong a)
        {
            System.out.println(a.getMessage());
        }
    }
    public static void main(String a[])
    {
    Scanner S=new Scanner(System.in);
    System.out.println("enter atm pin");
    String pin=S.next();
        ATMPin ap=new ATMPin(pin);
    try{
        ap.verify();
        }
    catch(Atmpinwrong n)
      {
            System.out.println(n.getMessage());
        }
  }
  
    }
 