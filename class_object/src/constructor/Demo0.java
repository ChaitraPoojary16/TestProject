package constructor;

public class Demo0 {
	String language;

	Demo0() {
		this.language = "Java";
	}

	Demo0(String language) {
		this.language = language;
	}

	public void getName() {
		System.out.println("programming Language:" + this.language);
	}

	public static void main(String[] args) {
		Demo0 d = new Demo0();
		Demo0 d1 = new Demo0("Sql");
		d.getName();
		d1.getName();
	}
}
