//Generate Custome exception if identifier have any special characters other than alphabets and digits
import java.util.*;
class InvalidIdentifier extends Exception{
    InvalidIdentifier(String msg){
        super(msg);
    }
}
class Identifier{
    String identifier;
    Identifier(String identifier){
    this.identifier=identifier.toLowerCase();
    }
    void verifyIdentifier() throws InvalidIdentifier{
        int count=0;
        for(int i=0;i<identifier.length();i++){
            if(!((identifier.charAt(i)>='a'&&identifier.charAt(i)<='z')||(identifier.charAt(i)>='0'&&identifier.charAt(i)<='9'))){
                count++;
            break;
        }}
        if(count==0)
            System.out.println("Valid Identifier");
        else
            throw new InvalidIdentifier("invalid Identifier");
    }
}
class SpecialCharacterException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter identifier data");
        String identifier=sc.next();
        Identifier id=new Identifier(identifier);
        try{
            id.verifyIdentifier();
        }
        catch(InvalidIdentifier e){
            System.out.println("Error :"+e.getMessage());
        }
    }
}
