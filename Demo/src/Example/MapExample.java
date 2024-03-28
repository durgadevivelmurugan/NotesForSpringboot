package Example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
Map<String,Integer>map=new HashMap<>();//Hashtable is also same as hashMap
map.put("Alex", 56);
map.put("Sam", 72);
map.put("Peter", 40);
map.put("Robert", 65);
System.out.println(map);
System.out.println(map.keySet());
System.out.println(map.size());

for(String name:map.keySet())
{
	System.out.println(name +"-"+map.get(name) ); //doubt
}


	}

}
