import java.util.Scanner;
class ToDoListMain
  {
    public static void main(String[] args)
     {
        char ch;
        int choice;
        Scanner sc = new Scanner(System.in);
        ToDoListImp td= new ToDoListImp();
        System.out.println("1.add task");
        System.out.println("2.edit task ");
        System.out.println("3.delete task");
        System.out.println("4.display task");
         do{
        System.out.println("enter your choice");
        choice = sc.nextInt();
        switch(choice)
            {
            case 1 : td.add();
                break;
            case 2 : td.edit();
                break;
            case 3 : td.delete();
                break;
            case 4 : td.displayIncompleteTasks();
                break;
        default : System.out.println("invalid choice");
            }
            System.out.println("do you want to continue one more option(y/n)");
            ch = sc.next().charAt(0);
            }
    while(ch != 'n');
      
    }
  }