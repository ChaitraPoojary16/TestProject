package objectClassDemo;

public class DemoHash {
int id;
String name;
	public DemoHash(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	public int hashCode()
	{
		return id;	
	}
	public String toString()
	{
		return getClass().getName()+"#"+ hashCode();
	}
}
