package core_java;

import java.util.Scanner;

public class ArraySearch96 {
public static void main(String[] args) {
	int []num= {34,67,90,30,21};
	boolean found=false;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the search element");
	int x=scn.nextInt();
	for(int i=0;i<5;i++) {
		if(x==num[i]) {
			 found=true;
			break;
			}
		}
	if(found) {
			System.out.println("Number found");
			
		}
	else
		{
			System.out.println("Number not found");
		}
	}
}

