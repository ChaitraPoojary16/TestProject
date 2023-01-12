package filesDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir")+"\\resources\\gd.txt";

		File file = new File(path);
		BufferedReader bf = new BufferedReader(new FileReader(file));
		
		  String text = bf.readLine();
		  System.out.println(text);
		 
		while ((text=bf.readLine())!= null)
		{
			System.out.println(text);
			text = bf.readLine();
			System.out.println(text);
		}

	}
}
