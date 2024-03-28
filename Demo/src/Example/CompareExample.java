package Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}	
	
}

public class CompareExample {
	
public static void main(String[] args) {
	
	//This is functional interface(so use lambda expression)
//	Comparator<Student>stu=new Comparator<Student>() {
//		public int compare(Student i,Student j ) {
//			if(i.age>j.age)
//				return 1;
//			else
//				return -1;
//		}
//	};
	
	//ternary operator used
	Comparator<Student>stu=( i, j )-> i.age>j.age?1:-1; 



List<Student>li=new ArrayList<>();
li.add(new Student(18,"alex"));//to add new student(new Student() is must)
li.add(new Student(12,"ram"));
li.add(new Student(21,"raj"));
li.add(new Student(19,"bob"));

Collections.sort(li,stu);

for(Student s:li) //enhance for loop
System.out.println(s);

}
}

// If don't want to use the comparator then implements comparable interface in student and use compareTo method(pass (Student)parameter)
//comparator is good

