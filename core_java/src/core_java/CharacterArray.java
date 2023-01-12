package core_java;

import java.util.Scanner;

public class CharacterArray 
{
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);	
System.out.println("Enter characters ");
/*For user input, use the Scanner class with System.in. 
After getting the input, convert it to character array */
char[] a=scn.next().toCharArray();
System.out.println("Values are ");
/*display it until the length of the character array i.e.
number of elements input by the user */
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);}
}
}
