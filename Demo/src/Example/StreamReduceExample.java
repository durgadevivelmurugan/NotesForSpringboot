package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {
List<Integer>li = new ArrayList<Integer>();
li.add(10);
li.add(40);
li.add(20);
li.add(30);
System.out.println(li);
Optional<Integer> sum=li
.stream()

//terminal method
.reduce((elem1,elem2) -> elem1+elem2);
System.out.println("total of : " +sum.get());
System.out.println(sum); //op==>optional[100](sum.get() is the correct way)

	}

}
