//Generate Custome exception if the person name not starting with Vowel
import java.util.*;
class InvalidPersonNameException extends Exception{
    InvalidPersonNameException(String message){
        super(message);
    }
}
class PersonName{
    String person_name;
    PersonName(String person_name){
        this.person_name=person_name.toLowerCase();
    }
    void checkPersonName() throws InvalidPersonNameException{
        
        if(person_name.charAt(0)=='a'||person_name.charAt(0)=='e'||person_name.charAt(0)=='i'||person_name.charAt(0)=='o'||person_name.charAt(0)=='u')
            System.out.println("Valid Person Name");
        else
            throw new InvalidPersonNameException("Invalid Person name");
    }
}
class PersonNameVowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Person Name");
        String person_name=sc.next();
        PersonName p=new PersonName(person_name);
        try{
            p.checkPersonName();
        }
        catch(InvalidPersonNameException e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}