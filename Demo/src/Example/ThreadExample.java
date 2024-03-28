package Example;
class Abc extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Bcd extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	
}
public class ThreadExample {

	public static void main(String[] args) {
Abc obj1=new Abc();
Bcd obj2= new Bcd();
  


obj1.start();
obj2.start();
	}

}
