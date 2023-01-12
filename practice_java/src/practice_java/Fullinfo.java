package practice_java;

public class Fullinfo extends StudentDetail implements Sports {
	String SportName;


	public void showSport() {
		System.out.println("Name of Sport " + SportName);
	}

	void ViewAll() {
		showDetail();
		showSport();
	}

	public void getsport(String s) {
		SportName=s;
		
	}
}
