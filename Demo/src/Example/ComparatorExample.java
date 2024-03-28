package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
Comparator<Integer>com=new Comparator<Integer>() {
	
	public int compare(Integer i, Integer j) {
		if(i%10 > j%10) 
		return 1;
		else
			return -1;
	}
};
List<Integer>l=new ArrayList<Integer>();
l.add(43);
l.add(31);
l.add(72);
l.add(29);

Collections.sort(l,com);
System.out.println(l);
	}

}
