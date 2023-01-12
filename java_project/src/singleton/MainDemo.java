package singleton;

public class MainDemo {
	 
public static void main(String[] args) {
	
	 SingletonClass ref = SingletonClass.getInstance();
	 System.out.println(ref);
	 SingletonClass ref2 = SingletonClass.getInstance();
	 System.out.println(ref2);
	 ref.toString();
	
}
}
