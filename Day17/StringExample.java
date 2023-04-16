/*import java.util.*;
class StringExample
{
  public static void main(String args[])
  {
    String str=new String();
    Scanner sc=new Scanner(System.in);
    //retreiving entire string
    System.out.println("Give the data to String");
    str=sc.nextLine();
    System.out.println(str);
    //retreiving character from string
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(13));
    //retreiving words from string
    //default delimiter value is space
    //split()method
    String strarray[]=str.split(" ");
    for(int i=0;i<strarray.length;i++)
          System.out.println(strarray[i]); 
    //1.length()
    System.out.println(str.length());
    int len=str.length();
    System.out.println(len);
    // 2.concatenation
    //2.1 concat()
    System.out.println(str.concat("hai"));
    String str2="hello";
    System.out.println(str.concat(str2));
    //2.2 + operator
    System.out.println(str+"hai");
    System.out.println(str+str2);
    //3.toString()
  StringExample String=new String("hello");
    System.out.println(String.toString());

    //4.char Extraction
    //4.1 charAt()
        System.out.println(str.charAt(3));
    //4.2 getChars()
    char p[]=new char[10];
    str.getchars(3,7,p,1);
    System.out.println(p);
    for(int i=0;i<p.length;i++)
        System.out.println(p[i]);
    //4.3 getbytes()
    char b[]=str.getBytes();
    for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
    //toCharArray
     char c[]=str.getBytes();
    for(int i=0;i<c.length;i++)
        System.out.println(c[i]);

    //string comparision
    System.out.println("Give the data to string2");
    String string2=new String(sc.nextLine());
    //1.compareTo() ---->int no.+ve/-ve/0
    System.out.println(str.compareTo(string2));
    //2.equals() ----->true/false
    System.out.println(str.equals(string2));
    //3. == ----->true/false
    System.out.println(str==string2);
    String s1="hello";
    String s2="hello";
    System.out.println(s1==s2);
    //4. startsWith() ---->t/f
    System.out.println(str.startsWith("1"));    
  System.out.println(string2.startsWith("ex"));
    //4. endsWith() ---->t/f
    System.out.println(str.endsWith("hello"));    
  System.out.println(string2.endsWith("&"));
    //2.equalsIgnoreCase() ----->true/false
    System.out.println(str.equalsIgnoreCase(string2));
    //searchinf for some pattern
    //1. indexOf ----> starting index no
    System.out.println(str.indexOf('z'));
    System.out.println(str.indexOf("of");
    //below example it checks from index 2
    System.out.println(str.indexOf('z',2));
//2. lastIndexOf ----> starting index no
    System.out.println(str.lastIndexOf('z'));
    System.out.println(str.lastIndexOf("of");
    //below example it checks from last 2 characters
    System.out.println(str.lastIndex('z',2));

    //toLowercase() & toUppercase()

        System.out.println(str.toLowercasetoLowercase());
        System.out.println(str.toUpperercase());
    //substring( startindex,endindex)
            System.out.println(str.substring(2));
            System.out.println(str.substring(2,3));
    //replace( )            
 System.out.println(str.replace("e","45"));
  }
}*/