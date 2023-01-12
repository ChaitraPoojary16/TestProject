package ConstructorsInJava;

public class Controuctorsmany {
	String name;
	double weight;
	int age;
	Controuctorsmany()
	{
		System.out.println("inside no arg constructor");
	}
	Controuctorsmany(String n, int a)
	{
		System.out.println("inside 2 arg constructor");
		name = n;
		age = a;
	}
	Controuctorsmany(String n, int a, double w)
	{
		System.out.println("inside 3 arg constructor");
		name = n;
		age = a;
		weight = w;
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		Controuctorsmany obj1 = new Controuctorsmany();
		System.out.println(obj1.name+ " "+obj1.age);
		
		Controuctorsmany obj2 = new Controuctorsmany("Dhanu", 24);
		System.out.println(obj2.name+ " "+obj2.age);

		Controuctorsmany obj3 = new Controuctorsmany("kp", 31, 56.600);
		System.out.println(obj3.name+ " "+obj3.age + " "+ obj3.weight);
	}
}
