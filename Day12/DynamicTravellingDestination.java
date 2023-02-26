import java.util.Scanner;
class DynamicTravellingDestination
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array");
        int size =s.nextInt();
      String TravellingDestination[]=new String[size];
      System.out.println("enter elements in an array");
      for(int i=0;i<size;i++)
        TravellingDestination[i]=s.next();
    displayTravelDestinations(TravellingDestination,size);
    }
    public static void displayTravelDestinations(String td[],int n1)
    {
      for(String h:td)
          System.out.println(h);
    }
  }