import java.util.*;
class StudentInputException{
    void readData(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter student grade");
        char grade=sc.next().charAt(0);
    }
        catch(Exception e){
            System.out.println("give input in char type only");
            readData();
        }
        try{
            System.out.println("Enter marks of student");
        double marks=sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("give input in double/integer type only");
            readData();
        }
        try{
            System.out.println("enter average");
            double avg=sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("give input in double/integer type only");
            readData();
        }
    }
        public static void main(String args[]){
            StudentInputException s=new StudentInputException();
            s.readData();
        }
}