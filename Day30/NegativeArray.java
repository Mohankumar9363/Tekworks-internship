//create a class ArraySequence having  add() and sequence() to give data and arrange all –ve numbers in descending order, if any array element is 0 or +ve then generate a custom exception. Test your code for any 6 different scenarios. Use an array of objects for the test cases. 
import java.util.*;
class InvalidElementInArrayException extends Exception{
    InvalidElementInArrayException(String msg){
        super(msg);
    }
}
class ArraySequence{
    int arr[];
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
                arr[i]=num;
    }
    }
        void sort(){
        for (int i = 0; i < arr.length; i++)   
        {  
        for (int j = i + 1; j < arr.length; j++)   
        {  
        int temp;  
        if (arr[i] < arr[j])   
        {  
        temp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = temp;  
        }  
           }  
        }
        for(int h:arr){
            if(h<0)
             System.out.println(h);
    }

}
    void check(){
        for(int q:arr){
            try{
            if(q>=0)
                throw new InvalidElementInArrayException("invalid element"+q);
        }
        catch(InvalidElementInArrayException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
}
class NegativeArray{
    public static void main(String args[]){
        ArraySequence a[]=new ArraySequence[6];
        for(int i=0;i<6;i++){
            a[i]=new ArraySequence();
        a[i].read();
        a[i].sort();
        a[i].check();
    }}
}
