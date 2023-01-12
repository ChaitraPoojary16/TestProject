package classTypeCcasting;

public class MainDC {
 public static void main(String[] args) {
	 MchineDC m = new MchineDC();
	 CameraDC c = new CameraDC();
	 
	//downcasting -super class type to sub class type convertion
	 // you should upcast the class before downcasting
	 int x =10;
	 byte a = (byte)x;
	 
	 MchineDC ref = new CameraDC();//upcasting
	 CameraDC obj = (CameraDC)ref; //downcasting
	 obj.display();
	 obj.print();
	 obj.view();
	 
	 //upcast first to downcast
		/*
		 * MchineDC m_up = new CameraDC(); CameraDC c_down =
		 * (CameraDC)m_up;//downcasting c_down.display(); c_down.view();
		 */}
}
