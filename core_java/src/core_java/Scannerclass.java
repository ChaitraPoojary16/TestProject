package core_java;

import java.util.Scanner;

public class Scannerclass 
{
public static void main(String[] args) {
	int size=5;
	int [] num=new int[size];
	Scanner scn=new Scanner(System.in);
	System.out.println("Please enter the number to array");
	for(int i=0;i<size;i++) {
		num[i]=scn.nextInt();
	}
	for(int i=0;i<size;i++) {
		System.out.println(num[i]);
	}
	
	
}
}
