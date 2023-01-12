import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// first array
		int size1 = scn.nextInt();
		int[] num = new int[size1];
		System.out.println("enter the values inot the array \n");
		for (int i = 0; i < num.length; i++) {
			num[i] = scn.nextInt();
		}
		System.out.println("this is the array");

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// second array
		int size2 = scn.nextInt();
		int[] num2 = new int[size2];
		System.out.println("enter the values inot the array \n");
		for (int i = 0; i < num2.length; i++) {
			num2[i] = scn.nextInt();
		}
		System.out.println("this is the array");

		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
	}
}
