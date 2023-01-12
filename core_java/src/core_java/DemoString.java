package core_java;

public class DemoString {
public static void main(String[] args) {
	String s1="CHAITRA";
	String s2=s1.toLowerCase();
	System.out.println("Lowercase: "+s2);
	
	String s3=s2.toUpperCase();
	System.out.println("Uppercase "+s3);
	
	String s4="Superficial";
	int size=s4.length();
	System.out.println("Length: "+size);
	
	String s5="malayalam";
	String s6=s5.replace('m','a');
	System.out.println("Replaced Word: "+s6);
	
	String a="   core java   ";
	String b=a.trim();
	System.out.println("Remove the white space: "+b);
	
	String a1="Chaitra ";
	String a2="Poojary";
	String a3=a1.concat(a2);
	System.out.println(a3);
	
	String s12="";
	boolean val=s12.isEmpty();
	System.out.println(val);
	
	String x="chaitra";
	String y="Chaitra";
	boolean val1=x.equals(y);
	System.out.println(val1);
	
	String x1="chaitra";
	String y1="Chaitra";
	boolean val2=x.equalsIgnoreCase(y1);
	System.out.println(val2);
}
}
