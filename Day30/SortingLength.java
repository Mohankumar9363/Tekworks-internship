//Create ArrayExample class having read() and sort() to take input and sort every set of elements. if the set of elements is less than 2 then generate a custom exception. Test your application for any 5 different cases. Use an array of objects for the test cases. 
class InvalidLengthOfArrayException extends Exception{
    InvalidLengthOfArrayException(String msg){
        super(msg);
    }
}
class ArrayExample{
    char charr[];
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("enter no of elements")
        int n=sc.nextInt();
        charr=new char[n];
        for(int i=0;i<n;i++){
            charr[i]=sc.next().charAt(0);
        }
    }
    void sort(){
        for (int i = 0; i < charr.length; i++)   
        {  
        for (int j = i + 1; j < charr.length; j++)   
        {  
        char temp;  
        if (charr[i] > charr[j])   
        {  
        temp = charr[i];  
        charr[i] = charr[j];  
        charr[j] = temp;  
        }  
           }  
        }
        for(char h:charr)
        System.out.println(h);
    }
    void check(){
        try
            {
        if(charr.length>=2)
            System.out.println("valid set of elements")
        else
            throw new InvalidLengthOfArrayException("invalid set of elements")
    }
    catch(InvalidLengthOfArrayException e){
        System.out.println("Error "+e.getMessage());
    }
}
class SortingLength{
    public static void main(String args[]){
        ArrayExample a[]=new ArrayExample[5];
        for(int i=0;i<5;i++)
            {
                a[i]=new ArrayExample();
                a[i].read();
                a[i].sort();
                a[i].check();
            }
    }
}