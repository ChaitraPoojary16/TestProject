package filesDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\Home_Admin\\Desktop\\New folder\\gd.txt";
		File file = new File(path);
		
		if (file.exists()) {
			System.out.println("file already exist");
		} else {
			file.createNewFile();
			System.out.println("new file created");
		}
		
		file.delete();
		System.out.println("file is deleted");
	}
}
