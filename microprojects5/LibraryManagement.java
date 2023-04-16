import java.util.*;
class Books
{
String title;
String author;
String isbn;
String publisher;
 
void getDetails()
{
  System.out.println("Book title is"+title);
  System.out.println("Book authoris"+author);
  System.out.println("Book isbn is"+isbn);
  System.out.println("Book publisher is"+publisher);
}
 
void setDetails()
{
  System.out.println("eneter deatils of a book");
  Scanner s=new Scanner(System.in);
  System.out.println("eneter book title");
  title=s.nextLine();
  System.out.println("eneter book author");
  author=s.nextLine();
  System.out.println("eneter book isbn");
  isbn=s.nextLine();
  System.out.println("eneter book publisher");
  publisher=s.nextLine();
}
 
}
 
class Author
{
String name;
String email;
String listofBook[]=new String[40];
void getDetails()
{
System.out.println("author name is"+name);
System.out.println("author eamil is"+email);
System.out.println("Books written by this autor is");
for(int i=0;i<listofBook.length;i++)
System.out.println(listofBook[i]);
}
void setDetails()
{
System.out.println("eneter deatils of an author");
Scanner s=new Scanner(System.in);
System.out.println("eneter author name");
name=s.nextLine();
System.out.println("eneter author email ");
email=s.nextLine();
System.out.println("eneter no of books written by this author");
int n=s.nextInt();
 
  System.out.println("give names of books");
for(int i=0;i<n;i++)
listofBook[i]=s.nextLine();
}
 
}
 
 
class LibraryManagement
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no of books");
int num=sc.nextInt();
Books b[]=new Books[num];
    for(int i=0;i<num;i++){
        b[i]=new Books();
        b[i].setDetails();
        b[i].getDetails();
    }
System.out.println("enter no of Authors");
int n=sc.nextInt();
Author au[]=new Author[n];
    for(int i=0;i<n;i++){
au[i]=new Author();
au[i].setDetails();
au[i].getDetails();
}
}}