package Cursor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	public static void main(String[] args)throws IOException {

		FileReader in = new FileReader("path");
		BufferedReader br = new BufferedReader(in);
	
		while ( br.readLine() != null) {
			System.out.println(br.readLine());
		}
		in.close();
		
	}
}
