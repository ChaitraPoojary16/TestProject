package singleton;

public class SingletonClass
{
	static SingletonClass obj = new SingletonClass();
	int count = 0;
	private SingletonClass()
	{
		count++;
		System.out.println("inside SingletonClass constructor");
		System.out.println(count);
	}
	
	static SingletonClass getInstance()
	{
		return obj;
	}
}
