package Example;

import java.util.HashSet;
import java.util.Optional;

public class StreamExample2 {

	public static void main(String[] args) {

HashSet<Integer> hs=new HashSet<Integer>();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(50);
hs.add(80);
 
 Optional<Integer>result=hs
		 .stream()
	    .min((no1,no2) -> no1.compareTo(no2));
//          .max((no1,no2) -> no1.compareTo(no2));
//.reduce((no1,no2)->no1+no2)
		 System.out.println(result.get());
	}

}
