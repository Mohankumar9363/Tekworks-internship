/*add element
insert element at first
insert element at last
get first element 
get last element 
remove first element 
remove last element*/
import java.util.*;
class LikedListExample
    {
        public static void main(String args[])
        {
            LinkedList l=new LinkedList();
            l.add(23);
            System.out.println(l);
            l.addFirst(20);
            System.out.println(l);
            l.addLast(30);
            System.out.println(l);
            System.out.println(l.getFirst());
            System.out.println(l.getLast());
            l.removeFirst();
            l.removeLast();
            l.addLast(33);
            l.addLast(44);
            l.remove();
            System.out.println(l);
            System.out.println(l.get(1));
       /* Enumeration e=l.elements();
            while(e.hasMoreElements())
                {
                    System.out.println(e.nextElement());
                }
        Iterator itr=l.iterator();
            while(itr.hasNext())
                {
                    System.out.println(itr.next());
                }
            ListIterator litr=l.listIterator();
            while(litr.hasNext())
                {
                    System.out.println(litr.next());
                }*/
        }
    }