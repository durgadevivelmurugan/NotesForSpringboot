package Example;

public class FunctionalclassEx implements FunctionalExample{

	public void display(int n1, int n2) {
		System.out.println(n1+n2);
	} 

	public static void main(String[] args) {
FunctionalExample fe=(a,b)->System.out.println(a+b);
		fe.display(10, 30);
	}
}

	


