package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
public static void main(String[] args){
	    try {
	      int arr[] = {1,3,4,2,45,6};
	      System.out.println(arr[131]);
	      System.out.println(25 / 0);
	      System.out.println("This statement will never get executed because the control has shifted to the catch block. ");
	    }
	    catch(ArithmeticException e) {
	      System.out.println("You are trying to divide by zero! That is not right!");
	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println("You are trying to access an index not in the array!");
	    }
	    finally {
	      System.out.println("This code is in the finally block. It does not depend on whether an exception occurs or not. ");
	    }
/*
 * try { FileInputStream fis = new FileInputStream("C://downloads//resume.pdf");
 * } catch (FileNotFoundException e) { System.out.println(); }
 */
/*
 * try { System.out.println(s.length()); } catch (Exception e) { s="test";
 * System.out.println(s.length()); //e.printStackTrace(); }
 */
}}
