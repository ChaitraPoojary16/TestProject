package core_java;

public class StringMethod {
public static void main(String[] args) {
	String str="Automation Testing";
	String s1="Chaitra";
	String s2="Helloo";
	System.out.println("String To Character-");
	char[] ary=str.toCharArray();
	for(int i=0;i<ary.length;i++) {
		System.out.println(ary[i]);
	}
	char[] arr=s1.toCharArray();
	System.out.println("String To Character elements-");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("Reverse Order");
	char[]arr1=s2.toCharArray();
	for(int i=arr1.length-1;i>=0;i--) {
		System.out.print(" "+arr1[i]);
	}
	
}
}
