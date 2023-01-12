package constructor;

public class Demo8 {
String empID;
double empSal;
Demo8(String empID,double empSal)
{
this.empID=empID;//this keyword is used to refer the class data members
this.empSal=empSal;
}
public static void main(String[] args) {
	Demo8 d=new Demo8("u120",123000);
	System.out.println(d.empID);
	System.out.println(d.empSal);
}
}
