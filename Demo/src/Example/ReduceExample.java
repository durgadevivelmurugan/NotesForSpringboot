package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {

		List<String>list=new ArrayList<String>();
		list.add("Alex");
		list.add("Boby");
		list.add("Den");
		list.add("Chris");
		
		Optional<String> result=list
				.stream()
//				.reduce((word1,word2)->word1.length() > word2.length()? word1:word2);
		.reduce((str1,str2)->str1 +"-"+ str2);
		//result.ifPresent(System.out::println);//this is also correct
		System.out.println(result.get());

	}

}
