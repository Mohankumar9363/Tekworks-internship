import java.util.Scanner;
class LinearSearch
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no of elements ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Ener elements");
            for(int i=0;i<size;i++)
                {
                    arr[i]=sc.nextInt();
                }
            System.out.println("Enter Element to find index");
            int num=sc.nextInt();
            int flag=-1;
            for(int i=0;i<size;i++)
                {
                    if(arr[i]==num)
                    {
                        System.out.println("index is "+i);
                        flag=0;
                        break;
                    }
                    
                }
            if(flag==-1)
                System.out.println("Not found");
        }
    }