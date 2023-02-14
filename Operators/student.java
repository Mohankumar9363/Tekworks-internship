import java.util.Scanner;
class Student
  {
    
    public static void main(String args[])
    {
      String s_name;
      int s_num;
    int Maths_marks;
    int Eng_marks;
    int Tel_marks;
      int sum;
      float avg;
      Scanner obj=new Scanner(System.in);
      s_name=obj.next(); 
      s_num=obj.nextInt();
      Maths_marks=obj.nextInt();
      Eng_marks=obj.nextInt();
      Tel_marks=obj.nextInt();
      System.out.println(" s_name="+  s_name);
      System.out.println(" s_num="+  s_num);
      System.out.println(" Maths_marks="+  Maths_marks);
      System.out.println(" Eng_marks="+  Eng_marks);
      System.out.println(" Tel_marks="+  Tel_marks);
      sum=Maths_marks+Eng_marks+Tel_marks;
      avg=sum/3;
      System.out.println("avg"+avg);
      
    }
  }