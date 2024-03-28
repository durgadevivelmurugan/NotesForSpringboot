package Example;
import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
	//Queue is an interface so we have to create obj for PriorityQueue
	Queue<Integer>que=new PriorityQueue<Integer>();
	que.add(10);
	que.add(30);
	que.add(20);
	System.out.println("Queue" +que);
	System.out.println(que.remove());
	System.out.println(que.peek());
	
	}
}
