package core_java;

public class Frequency1 {
public static void main(String[] args) {
	int []arr= {40,10,20,30,10,20,30};
	System.out.println("Sorted array-");
	//sorting array
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(" " +arr[i]);
	}
	System.out.println("After removing the elements-");
	//removing duplicate elements
	int[] arr1=new int[arr.length];
	int k=0;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			arr1[k++]=arr[i];
		}
	}
		arr1[k]=arr[arr.length-1];
		for( int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Count the numbers-");
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr1[i]==arr[j]) {
					count++;
				}
			}
			System.out.println("count of "+arr1[i]+"="+count);
		}
	}
}

