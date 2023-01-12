package mInheritInterface;

public class Sample implements Demo1, Demo2 {

	public void put() {
		System.out.println("put is update");
	}

	public void login() {
		System.out.println("Login to android, mac,windows");
	}

	public void post() {
		System.out.println("Post is insert");
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.login();
		s.post();
		s.put();
	}

}
