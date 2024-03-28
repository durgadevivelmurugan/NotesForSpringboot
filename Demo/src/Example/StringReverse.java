package Example;

public class StringReverse {

	public static void main(String[] args) {
////String input="Durga";
//StringBuilder sb=new StringBuilder("Durga");
////sb.append(input);
//sb.reverse();
//System.out.println(sb);


		//method 2
		String name="good";
		char[] a=name.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}




	}

}
