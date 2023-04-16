import java.util.*;
class Student 
{
  String name;
  String id;
  int totalmarks;
    Student(String name, String id, int totalmarks) {
    this.name = name;
    this.id = id;
    this.totalmarks = totalmarks;
 }
    public String getName() {
    return name;
    }
    public String getId() {
     return id;
    }
    public int getTotalMarks() {
    return totalmarks;
    }
}
class StudentArrayList {
    public static void main(String k[]) 
    {
      ArrayList<Student> ar1 = new ArrayList<Student>();
     ar1.add(new Student("aaa", "123", 67));
        Student s1=new Student("aaa", "123", 67);
     System.out.println(s1.getName());
    System.out.println(s1.getId());
    System.out.println(s1.getTotalMarks());
    ArrayList<Object> ar2 = new ArrayList<Object>();
    ar2.add(45);
    ar2.add(46);
    ar2.add(46.346564);
    }
}