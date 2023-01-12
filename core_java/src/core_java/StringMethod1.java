package core_java;

public class StringMethod1 {
public static void main(String[] args) {
	String s1="Automation Testing";
	String[]arr=s1.split(" ");
	System.out.println("Reversed characters are:");
	for(int i=0;i<arr.length;i++) {
		String temp=arr[i];
		char[] arr1=temp.toCharArray();
		for( int j=arr1.length-1;j>=0;j--) {
			System.out.println(arr1[j]);
		}
		System.out.println(" ");
	}
}
}
