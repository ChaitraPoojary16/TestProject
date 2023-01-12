package hybrid;

public class Sample {
	 public static void main(String[] args) {
		
	
	Son obj = new Son();  
	obj.showS();  // Accessing Son class method  
	obj.showF();  // Accessing Father class method  
	obj.showG();  // Accessing GrandFather class method  
	Daughter obj2 = new Daughter();  
	obj2.showD();  // Accessing Daughter class method  
	obj2.showF();    // Accessing Father class method  
	obj2.showG();   // Accessing GrandFather class method  
	}    
}
