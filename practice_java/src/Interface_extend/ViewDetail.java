package Interface_extend;

public class ViewDetail implements ShowDetail {
String Name;
int code;
	
	public void getCollegeName(String s) {
		Name=s;
	}

	public void getCollegeCode(int a) {
	code=a;
	}

	
	public void showCollegeName() {
		System.out.println("College name is "+Name);
	}

	public void showCollegeCode() {
		System.out.println("College code is "+code);
	}
	void showCollegeCity() {
		String city = null;
		System.out.println("City "+city);
	}
	void CallAllShow() {
		showCollegeName();
		showCollegeCode();
		showCollegeCity();
	}
}
