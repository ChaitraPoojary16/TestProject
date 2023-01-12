package filesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"\\resources\\gd.txt";
	
		File file = new File(path);
		if (file.exists()) {
			System.out.println("file already exist");
		} else {
			file.createNewFile();
			System.out.println("new file created");
		}	
	}
}
