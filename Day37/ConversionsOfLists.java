import java.util.*;
class ConversionsOfLists
    {
        public static void main(String args[])
        {
            ArrayList al=new ArrayList();
            al.add(1);
            al.add(10);
            al.add(3);
            al.add(12);
            System.out.println("Array List: "+al);
            LinkedList ll=new LinkedList(al);
            System.out.println("LinkedList: "+ll);
            HashSet hs=new HashSet(ll);
            System.out.println("Set: "+hs);
            ArrayList al1=new ArrayList(hs);
            System.out.println("Array List: "+al1);
        }
    }