//To-do List: Create a class called ToDoList that stores a collection of tasks in a LinkedList. The class should have methods to add, edit, and delete tasks, as well as to mark a task as complete and display all incomplete tasks.
import java.util.*;

class ToDoListImp implements ToDoListInterface {
  Scanner sc = new Scanner(System.in);
  LinkedList l = new LinkedList();

  public void add() {
    System.out.println("Enter no of tasks to add");
    String x1 = sc.nextLine();
    int x = Integer.parseInt(x1);
    for (int i = 0; i < x; i++) {
      System.out.println("Enter task to add in ToDoList");
      String task = sc.nextLine();
      l.add(task);
    }
  }

  public void edit() {
    System.out.println("Enter task to replace the old task");
    String task = sc.nextLine();
    System.out.println("Enter index of old task to replace");
    int index = sc.nextInt();
    l.set(index, task);
  }

  public void delete() {
    System.out.println("Enter index to remove task");
    int index = sc.nextInt();
    l.remove(index);
  }

  public void displayIncompleteTasks() {
    System.out.println("Enter no of Completed tasks");
    String num1 = sc.nextLine();
    int num = Integer.parseInt(num1);
    String tasks[] = new String[num];
    System.out.println("Enter completed tasks");
    for (int i = 0; i < num; i++) {
      tasks[i] = sc.nextLine();
    }
    for (int i = 0; i < tasks.length; i++) {
      String str = tasks[i];
        for(int j=0;j<l.size();j++)
            {
                if(str.equals(l.get(j)))
                   l.set(j,null);
            }
        for(int k=0;k<l.size();k++)
            {
                if(l.get(k)!=null)
                    System.out.println(l.get(k));
            }      
    }
  }
}
