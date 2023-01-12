package constructor;

public class Sum {
	public static void main(String [] args)  
	{  
	 
	Sum obj = new Sum();  
	   
	System.out.println("The sum is: "+obj.add(12, 13));  
	}  
	int s;  
	 
	public int add(int a, int b)  
	{  
	s = a+b;  
	
	return s;  
	} 
}
