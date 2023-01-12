package core_java;

public class EvenOddCount {
public static void main(String[] args) {
	int arr[]= {2,1,43,5,67,44,88,77,11,3};
	int even=0;
	int odd=0;
	for(int i=0;i<10;i++) {
		if(arr[i]%2==0) {
			even++;
		}
		else
		{
			odd++;
			
		}
	}
	System.out.println("Content of the array");
	for(int i=0;i<10;i++) {
		System.out.println(arr[i]+"");
	}
	System.out.println("Total even no's: " +even);
	System.out.println("Total odd no's "+odd);
	
}
}
