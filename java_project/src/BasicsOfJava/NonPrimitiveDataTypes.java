package BasicsOfJava;

public class NonPrimitiveDataTypes 
{
	String str;
	public static void main(String[] args) {
		
		String name = "World";
		String wish = "Hello, ";
		
		NonPrimitiveDataTypes obj = new NonPrimitiveDataTypes();
		
		System.out.println("str = " + obj.str);
		
		//using addition method
		System.out.println(wish.concat(name));		
	}
}
