package objectClassDemo;

public class DemoEquals {

	int id;
	String name;
	public DemoEquals(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object obj2)
	{
		//first object values are stored in variables name1 & id1
		String name1 = this.name;
		int id1 = this.id;
		System.out.println(name1);
		System.out.println(id1);
		
		//second object value are stored in variables name2 & id2
		DemoEquals d = (DemoEquals)obj2;
		String name2 = d.name;
		int id2 = d.id;
		System.out.println(name2);
		System.out.println(id2);
		
		if(name1.equals(name2))
		{
			return true;
		}
		else
		return false;
		
		/*
		 * DemoEquals obj = (DemoEquals)objM;//type casting String name2 = obj.name; int
		 * id2 = obj.id; if(name1.equals(name2)) { return true; } else return false;
		 */	
	}
}
