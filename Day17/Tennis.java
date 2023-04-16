import java.util.*;
class Tennis
{
  public static void main(String args[])
  {
    String str=new String();
    Scanner sc=new Scanner(System.in);
    System.out.println("Give the Scores in Zeroes and ones only");
    str=sc.nextLine();
    int count_zeroes =0;
    int count_ones=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='0')
        count_zeroes++;
      else
        count_ones++;
    }
    if(count_zeroes<count_ones)
      System.out.println("win");
    else
            System.out.println("lose");

    }}