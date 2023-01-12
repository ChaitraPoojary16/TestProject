package encapsulation;

public class Demo1 {
	private String empName;
	private double empSal;
	private int empId;

	public Demo1(String name, double salary, int id) {
		this.empName = name;
		this.empSal = salary;
		this.empId = id;
	}

	public String getempName() {
		return empName;
	}

	public double getempSal() {
		return empSal;
	}

	public int getempId() {
		return empId;
	}

	public void setempName(String newName) {
		this.empName = newName;
	}

	public void setempSal(double salary) {
		this.empSal = salary;
	}

	public void setempId(int id) {
		this.empId = id;
	}
}
