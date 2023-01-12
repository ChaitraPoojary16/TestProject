package polymorphism;

public class OverloadingDemo
{
	//in a class if we have more than one method with same name but diff in length and type of 
	//parameters -- to achieve compile time polymorphism
	public static void main(String[] args)
	{
		OverloadingDemo.view();//calling static methods with class name
		view(20);
		view("sumanth");
	} 	
	int x = 90;
	public static void view()
	{
		System.out.println("inside no arg view method");
	}
	public static void view(int age)
	{
		System.out.println("inside int arg view method");
	}
	public static void view(String name)
	{
		System.out.println("inside string arg view method");
	}
}
