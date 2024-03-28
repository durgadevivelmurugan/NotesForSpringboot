package Example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
ArrayList<String>al=new ArrayList<String>();
System.out.println(al);

al.add("abi");
al.add("bob");
//al.remove(0);
al.add("alex");
al.add("fury");
al.add("chris");

System.out.println(al);
Collections.sort(al);
//al.sort(null);
System.out.println(al);
	}

}
