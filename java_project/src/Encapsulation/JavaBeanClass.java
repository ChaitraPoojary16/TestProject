package Encapsulation;

class JavaBeanClass {
	
	private String empName;
	private int empId;
	private double salary;
	
	public JavaBeanClass(String name, int id,double salary)
	{
		this.empName = name;
		this.empId = id;
		this.salary = salary;
	}
	
	public String getEmpname()
	{
		return empName;
	}
	public void setEmpname(String name)
	{
		this.empName = name;
	}
	public int getEmpId()
	{
		return empId;
	}
	public void setEmpId(int id)
	{
		this.empId = id;
	}
	public double getEmpSalary()
	{
		return salary;
	}
	public void setEmpSalary(double salary)
	{
		this.salary = salary;
	}
}
