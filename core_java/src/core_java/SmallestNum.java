package core_java;

public class SmallestNum {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 30, 50, 90, 50};
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] < min)
				min = arr[i];
			
		}
			System.out.println("Smallest element in the array list " + min);
		

	}
}
