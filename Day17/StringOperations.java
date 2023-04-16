/*Write a Java program to concatenate a given string to the end of another string
Write a Java program to create a new String object with the contents of a character array
Write a Java program to get the character at the given index within the String
Write a Java program to compare two strings lexicographically
Write a Java program to compare a given string to another string, ignoring case considerations.
Write a Java program to convert all the characters in a string to uppercase
Write a Java program to get the index of a pattern in the given string*/
import java.util.*;
class StringOperations{
  public static void main(String ar[]){
    Scanner sc=new Scanner(Sysytein);
    System.out.println("Give data to String1");
    String str1=new String();
    str1=sc.nextLine();
    displayconcat(str1);
    displayStringFromCharArray();
    displayGetCharAtIndex(str1);
    displayCompareTwoStrings(str1);
    displayCompareTwoStringsIgnoringCase(str1);
    displayStringUpperCase(str1);
    displayIndexOfPattern( str1);
  }
  public static void displayconcat(String str1){
    System.out.println("Give data to String2");
    String str2=new String();
    str2=sc.nextLine();
    System.out.println(str1.concat(str2));
  }
    public static void displayStringFromCharArray(){
      Scanner s=new Scanner(System.in);
      System.out.println("enter no of characters:");
      int size=s.nextInt();
      char ch[]=new char[size];
      for(int i=0;i<size;i++){
        ch[i]=s.next().charAt(0);
    }
      System.out.println(tostring(ch));
  }
  public static void displayGetCharAtIndex(String str1){
    Scanner s=new Scanner(System.in);
      System.out.println("enter index no:");
      int index=s.nextInt();
     System.out.println("The char is:"+str1.charAt(index));

  }
  public static void displayCompareTwoStrings(String str1){
    System.out.println("Give data to String2");
    String str2=new String();
    str2=sc.nextLine();
    System.out.println(str1.compareTo(str2));
  }
  public static void displayCompareTwoStringsIgnoringCase(String str1){
    System.out.println("Give data to String2");
    String str2=new String();
    str2=sc.nextLine();
    System.out.println(str1.compareToIgnoreCas(str2));
  }
  public static void displayStringUpperCase(String str1){
    System.out.println(str1.toUpperCase());
  }
  public static void displayIndexOfPattern(String str1){
    System.out.println("enter the pattern ");
    String pattern=new String(sc.nextLine());
        System.out.println("e ");

    System.out.println(str1.indexOf(pattern, 1));
  }
}
