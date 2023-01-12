package BasicsOfJava;

public class FinalVariableExample {
final int a = 10;
	
	void show() {
		System.out.println("a = " + a);
		//a = 20;	//Error due to final variable cann't be modified
	}

	public static void main(String[] args) {
		
		FinalVariableExample obj = new FinalVariableExample();
		obj.show();
		
	}
}
