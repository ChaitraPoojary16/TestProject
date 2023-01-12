package inheritInterface;

public class Sample implements Demo2 {

	public void m1() {
		System.out.println("Inside m1 method");

	}

	public void m2() {
		System.out.println("Inside m2 method");
	}

	public void display() {
		System.out.println("Inside display method");
	}

	public void camera() {
		System.out.println("Inside camera method");
	}
public static void main(String[] args) {
	Sample s=new Sample();
	s.camera();
	s.display();
	s.m1();
	s.m2();
}
}
