package constructor;

public class Demo7 {
	Demo7(){
		System.out.println("Default Constructor");
	}
	Demo7(int i){
		System.out.println("value of I is" +i );
	}
	Demo7(int i,int j){
		System.out.println();
	}
	public static void main(String[] args) {
		Demo7 d=new Demo7();
	}
}
