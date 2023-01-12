package core_java;

import java.util.Scanner;

public class Percentage {
public static void main(String[] args) {
	int [] sub=new int[5];
	int total=0;
	float per;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the marks for 5 subjects");
	for(int i=0;i<5;i++) {
		System.out.print("Enter marks for subject["+i+"]:");
		sub[i]=scn.nextInt();
	}
	for(int i=0;i<5;i++)
	{
		total=total+sub[i];
	
	}
	per=(float)total/5;
	System.out.println("Percentage: "+per);
	System.out.println("Total:"+total);
}
}
