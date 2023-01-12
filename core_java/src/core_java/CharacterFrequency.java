package core_java;

import java.util.Arrays;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str = "chaitra";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println("String To Character elements in alphabet form-");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			System.out.println("*******");
			int count = 1;

			for ( int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					count++;
				} else {
					System.out.println(arr[i] + "=" + count);
					count = 1;
				}

			}
			int i=0;
			char a = str.charAt(i - 1);
			System.out.println(a + "=" + count);
		}
	}
