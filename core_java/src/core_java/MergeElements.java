package core_java;

public class MergeElements 
{
public static void main(String[] args) {
	int [] arr1= {10,20,30,40};
	int[] arr2= {50,60,70,80,90};
	int[] arr3=new int[9] ;
	System.out.println("First array elements: ");
	for(int i=0;i<4;i++) {
		System.out.println(" " +arr1[i]);
	}
	System.out.println("Second array elements:");
	for(int i=0;i<5;i++) {
		System.out.println(" " +arr2[i]);
	}
	System.out.println("Merge elements are:");
	for(int i=0;i<arr3.length;i++) {
		if(i<arr1.length) {
			arr3[i]=arr1[i];
		}
		else
		{
			arr3[i]=arr2[i-arr1.length];
	}
		
	System.out.print(" "+arr3[i]);
}
}
}