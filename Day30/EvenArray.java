//create a class EvenArray having  add() and testEven() methods to take input and verify whether each array element is even or not, if the element is not an even number generate a custom exception, Test your code for any 4 different cases. Use an array of objects for the test cases. 
class InvalidArrayException extends Exception{
    InvalidArrayException(String msg){
        super(msg);
    }
}
class EvenArray{
    int arr[];
    Scanner sc=new Scanner(System.in);
    void read(){
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void testEven(){
        try{
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                System.out.println("Element is even");
            else
                throw new InvalidArrayException("Element is not even")
        }
        catch(InvalidArrayException e){
            System.out.println("Error :"+e.getMessage());
        }
    }}
class EvenArray{
    public static void main(String args[]){
        EvenArray ea[]=new EvenArray[4];
        for(int i=0;i<4;i++){
            ea[i]=new EvenArray();
            ea[i].read();
            ea[i].testEven();
        }
    }
} 