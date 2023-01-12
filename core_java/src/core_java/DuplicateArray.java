package core_java;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr =  { 4, 2, 4, 2, 4, 5, 4 };
		int count = 0;
		int search = 4;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				count++;
			}

		}
		System.out.println("Duplicate elements are: "+count);
	}
}
