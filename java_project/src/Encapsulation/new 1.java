class Demo
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add(34);
		v.add("shell script");
		v.add("java");
		v.add("C_hash");
		v.add("ruby");
		v.add(null);
		sysout(v);
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			
			String s = (String)e.nextElement();
			sysout(s);
		}
	}
}