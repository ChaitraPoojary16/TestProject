package ConstructorsInJava;

public class CopyConstructorDemo {

	int age;
	String name;
	
	public CopyConstructorDemo(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public CopyConstructorDemo(CopyConstructorDemo obj) {
		this.age = obj.age;
		this.name = obj.name;
	}

	public static void main(String[] args) {
		CopyConstructorDemo obj = new CopyConstructorDemo(21, "sathish");
		System.out.println(obj.age);
		System.out.println(obj.name);
		
		CopyConstructorDemo copyObj = new CopyConstructorDemo(obj);
		System.out.println(copyObj.age);
		System.out.println(copyObj.name);
	}
	
}
