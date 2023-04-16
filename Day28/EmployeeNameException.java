//Generate Custome exception if the name of any employee have digits
import java.util.*;
class InvalidEmployeeNameException extends Exception{
    InvalidEmployeeNameException(String message){
        super(message);
    }
}
class EmployeeName{
    String employee_name;
    EmployeeName(String employee_name){
        this.employee_name=employee_name;
    }
    void checkEmployeeName() throws InvalidEmployeeNameException{
        int count=0;
        for(int i=0;i<employee_name.length();i++){
            if(employee_name.charAt(i)>='0'&&employee_name.charAt(i)<='9')
                count++;
            }
        if(count==0)
            System.out.println("Valid Employee Name");
        else
            throw new InvalidEmployeeNameException("Invalid Employee name");
    }
}
class EmployeeNameException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String employee_name=sc.next();
        EmployeeName p=new EmployeeName(employee_name);
        try{
            p.checkEmployeeName();
        }
        catch(InvalidEmployeeNameException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}