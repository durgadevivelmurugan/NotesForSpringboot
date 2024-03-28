package Example;
import java.util.*;
public class StreamExample {
	public static void main(String[] args) {
		ArrayList<Integer>alist=new ArrayList<Integer>();
		alist.add(100);
		alist.add(200);
		alist.add(5);
		alist.add(15);
		
		
		//Stream is an interface which have multiple methods(filter,map,toarray etc)
		//once you used the stream you cannot reuse it
		
		alist
		.stream()
		.sorted()   //intermediate operations
		.distinct()
		.filter(no -> no%4==0)  //o.p(100,200)
		
		.map(no->no/2)
		
		.forEach(System.out::println);   //terminal operations

		System.out.println(alist);//List won't change (stream temprory save)
	}

}
