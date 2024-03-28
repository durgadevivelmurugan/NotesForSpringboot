package Example;

import java.util.Objects;

//class Human{
//	private final int id;
//	private final String name;
//	
//	public Human(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public String toString() {
//		return "Human [id=" + id + ", name=" + name + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Human other = (Human) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//	
//	
//	
//	
//	
//}

//all the variables must be private and final(because immutable data)(don't need to mention it)
//cannot extend other class &can implement interface
record Human(int id,String name)  //it also a parameterized constructor
{
//	public Human(int id,String name) //canonical constructor
//	{
//		if(id==0) 
//			throw new IllegalArgumentException("id canot be zero");
//		this.id=id;
//		this.name=name;
//	}
	
	public Human //compact canonical constructor
	{
		if(id==0) 
			throw new IllegalArgumentException("id canot be zero");
		
	}


}
public class RecordExample {

	public static void main(String[] args) {

		Human h1=new Human(1,"dd");
		Human h2=new Human(1,"dd");
//		Human h3=new Human();  //no default constructor
		//don't have set() (because it is only for store data)
		
		 System.out.println(h1);
		 System.out.println(h1.equals(h2));
		
	}

}
