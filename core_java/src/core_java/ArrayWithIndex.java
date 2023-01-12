package core_java;

import java.util.Scanner;

public class ArrayWithIndex {
public static void main(String[] args) {
	int [] num= {20,12,43,5};
	int found=-1;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the search element");
	int n=scn.nextInt();
	for(int i=0;i<4;i++) {
		if(n==num[i]) {
			found=i;
			break;
		}
	}
	if(found!=-1) {
		System.out.println("Number found, index is:"+found);
	}else

		System.out.println("Number found");

}
}
