package abstractC;

public class Sample extends Demo2 {
	void view() {
		System.out.println("Inside view method");
	}

	void insert() {
		System.out.println("Inside insert method");
	}

	void delete() {
		System.out.println("Inside delete method");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.delete();
		s.insert();
		s.view();
		s.check();
		s.print();
	}
}
