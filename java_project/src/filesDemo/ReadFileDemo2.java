package filesDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFileDemo2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Home_Admin\\Desktop\\New folder\\gd.txt");
			Reader rd = new InputStreamReader(fis);
			int data = rd.read();
			while (data != -1) {
				System.out.print((char) data);
				data = rd.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
