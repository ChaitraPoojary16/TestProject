package encapsulation;

public class Main {
	public static void main(String[] args) {
		Demo1 d = new Demo1("Hari", 34000.00, 101);
		String name = d.getempName();
		System.out.println("Employee name " + name);
		double sal = d.getempSal();
		System.out.println("Employee Salary " + sal);
		int num = d.getempId();
		System.out.println("Employee Id " + num);
		d.setempName("Ram");
		d.setempSal(45000.00);
		d.setempId(102);
		System.out.println();
		System.out.println("Using setter method we have updated the details of employee");
		
		System.out.println(d.getempName());
		System.out.println(d.getempSal());
		System.out.println(d.getempId());
	}
}
