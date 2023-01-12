import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		char[] car = new char[4];
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the values inot the array \n");
		for(int i=0;i<car.length;i++)
		{
			car[i] = scn.next().charAt(0);
		}
		System.out.println("this is the array");

		for(int i=0;i<car.length;i++)
		{
			System.out.println(car[i]);		}
	}
}
