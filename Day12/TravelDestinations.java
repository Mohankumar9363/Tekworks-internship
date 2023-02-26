class TravelDestinations
  {
    public static void main(String args[])
    {
      String TravellingDestinations[]={"Goa","Araku","Paris","USA"};
      TravelDestinations.displayTravelDestinations(TravellingDestinations,4);
      
    }
    public static void displayTravelDestinations(String td[],int n1)
    {
      for(String h:td)
          System.out.println(h);
    }
  }