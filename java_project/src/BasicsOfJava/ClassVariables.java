package BasicsOfJava;

public class ClassVariables {

	final int x = 100;//instance variable
	static int y = 90;

	public static void main(String[] args) {
		
		ClassVariables obj = new ClassVariables();
		
		//obj.x = 20;
		
		System.out.println(obj.x);
		
		System.out.println(y);
	}
}
