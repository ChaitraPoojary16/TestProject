package class_object;

public class Demo {

	public static void main(String[] args) {
		String s1 = "Sunil";
		String s2 = "Sunil";
		//content comparison
		boolean check = s1.equals(s2);
		System.out.println(check);
		//reference comparison
		boolean check2 =s1==s2;
		System.out.println(check2);
		
		String s3 = new String("Anil");
		String s4 = new String("Anil");
		//content comparison
		boolean check3 = s3.equals(s4);
		System.out.println(check3);
		//reference comparison
		boolean check4 = s3==s4;
		System.out.println(check4);
	}
}
