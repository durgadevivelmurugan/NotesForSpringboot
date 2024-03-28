package Example;

import java.util.*;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
LinkedList<String>ll=new LinkedList<String>();
ll.add("ajay");
ll.add("anu");
System.out.println(ll);

ll.add(1,"ravi");
System.out.println(ll);

LinkedList<String>ll2=new LinkedList<String>();
ll2.add("john");
ll2.add("raj");
System.out.println(ll2);
ll.addAll(ll2);
System.out.println(ll);


LinkedList<String>ll3=new LinkedList<String>();
ll3.add("john");
ll3.add("peter");
System.out.println(ll3);


ll.addAll(1,ll3);
System.out.println(ll);
ll.addFirst("ram");

//add in position
ll.add(3,"sam");
System.out.println(ll);

//update the existing value
ll.set(3,"sami");
System.out.println(ll);
//to remove value and with index
//ll.remove("sami");
ll.remove(3);

//iterating(normal==>ll.iterator())
Iterator <String >i=ll.descendingIterator();

while(i.hasNext()) {
System.out.println(i.next());
	}
}

}
