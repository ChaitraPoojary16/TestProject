package abstractMethod;

public class Main {
	public static void main(String[] args) {
		Transaction t=new ATM();
		t.withdraw();
		t.verifypin();
	}
}
