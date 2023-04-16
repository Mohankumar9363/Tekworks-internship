/*Create a class 'Student' with three data members which are name, age, and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. The first method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 2 students.*/
import java.util.*;
class Student{
  String name;
  int age;
  String address;
  Student(){
    name="unknown";
    age=0;
    address="not available";
  }
  void setInfo(String name,int age){
    this.name=name;
    this.age=age;
    System.out.println("the name of student is"+name);
    System.out.println("the age of student is"+age);
  }
  void setInfo(String name,int age,String address){
    this.name=name;
    this.age=age; 
    this.address=address;
    System.out.println("the name of student is"+name);
    System.out.println("the age of student is"+age);
    System.out.println("the address of student is"+address);
  }
}
class StudentDetails{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Student s=new Student();
    Student s1=new Student();
    System.out.println("enter student name");
    String name=sc.nextLine();
    System.out.println("enter student age");
    int age=sc.nextInt();
    System.out.println("enter address of student");
    String address=new String(sc.nextLine());
    s.setInfo(name, age);
    s1.setInfo(name, age);
    s.setInfo(name, age,address);
    s1.setInfo(name, age, address);
  }
}