package Example;

@FunctionalInterface
interface A{
int add(int i,int j);
}
 
public class LambdaExpression {

	public static void main(String[] args) {

//		A obj=new A() {		//old method(i.e.we are creating implementation inside the object creation.
//			                        //(anonymous class)
//		public int add(int i,int j) 
//		{
//				return i+j;
//			}
//		};
//		System.out.println(obj.add(5, 5));
		
		A obj= ( i,j)->i+j;//Lambda expression
		System.out.println(obj.add(5, 5)) ; 
		
		
	}

}
