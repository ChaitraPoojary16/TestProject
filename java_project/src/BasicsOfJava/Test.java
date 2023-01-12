package BasicsOfJava;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		System.out.println("lets enter the itemas and list them");
		String[] itemList = Test.enterItems();
		Test.printTheItemsList(itemList);
	}

	static String[] enterItems() {
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the size of the array");
		int size = scn.nextInt();
		String[] items = new String[size];

		// reading items from user
		for (int i = 0; i < size; i++) {
			System.out.println("entr the items");
			items[i] = scn.next();
		}
		return items;
	}

	static void printTheItemsList(String[] itemList) {
		for (int i = 0; i < itemList.length; i++) {
			System.out.println(itemList[i]);
		}

	}

}
