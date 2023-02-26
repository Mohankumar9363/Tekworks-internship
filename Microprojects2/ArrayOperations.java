import java.util.Scanner;
class ArrayOperations
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array");
        int size =s.nextInt();
      int array[]=new int[size];
      System.out.println("which of the fpllowing operations do you want to perform");
      System.out.println("1. Insert an element in first index ");
      System.out.println("2. Insert an element in last index");
      System.out.println("3. Insert an element in specified index");
      System.out.println("4.Remove element from first index");
      System.out.println("5.Remove element from last index");
      System.out.println("6.Remove element from specified index");
      System.out.println("7.Remove user eneted element");
      System.out.println("8.Display all in ASC/DESC order.");
      System.out.println("9.Display Array Elements.");
      int option=s.nextInt();
      switch(option)
        {
        case 1:insertAtFirstIndex(array,size);
               break;
        case 2:insertAtLastIndex(array,size);
               break;
        case 3:insertAtSpecifiedIndex(array,size);
               break;
        case 4:RemoveFromFirstIndex(array,size);
               break;
        case 5:RemoveFromLastIndex(array,size);
               break;
        case 6:RemoveFromSpecifiedIndex(array,size);
               break;
        case 7:RemoveUserEnteredElement(array,size);
               break;
        case 8:DisplayAscendindOrder(array,size);
               break;
        case 9:DisplayArrayElements(array,size);
               break;
        }}
       static void insertAtFirstIndex(int array[],int size)
       {
         Scanner s=new Scanner(System.in);
        System.out.println("enter element for inserting in first index");  
         array[0]=s.nextInt();
        }
     static void insertAtLastIndex(int array[],int size)
        {
        Scanner s=new Scanner(System.in);
        System.out.println("enter element for inserting in last index");  
         array[size-1]=s.nextInt();
        }
      static void insertAtSpecifiedIndex(int array[],int size)
        {
        Scanner s=new Scanner(System.in);
        System.out.println("enter position number");  
         int position=s.nextInt();
        System.out.println("enter element for inserting in Specified index");  
         array[position]=s.nextInt();
        }
      static void RemoveFromFirstIndex(int array[],int size)
        {  
         array[0]=0;
        }
      static void RemoveFromLastIndex(int array[],int size)
        {
        array[size-1]=0;
        }
      static void RemoveFromSpecifiedIndex(int array[],int size)
        {
        Scanner s=new Scanner(System.in);
        System.out.println("enter position number");  
         int position=s.nextInt();
        array[position]=0;
        }
      static void RemoveUserEnteredElement(int array[],int size)
        {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the element to remove from array");
        int remove=s.nextInt();
        int i;
        for(i=0;i<size;i++)     
        {
          if(array[i]==remove)
            array[i]=0;
        }
        if(i==size)
          System.out.println("element is not found");
        }
      static void DisplayAscendindOrder(int array[],int size)
        {
        for (int i = 0; i < array.length; i++)   
        {  
        for (int j = i + 1; j < array.length; j++)   
        {  
        int temp = 0;  
        if (array[i] > array[j])   
        {  
        temp = array[i];  
        array[i] = array[j];  
        array[j] = temp;  
        }  
        }} 
        }
      static void DisplayArrayElements(int array[],int size)
        {
        for(int h:array)
          System.out.println(h);
        }}
               