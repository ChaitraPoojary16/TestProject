package filesDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteFileDemo {
	public static void main(String[] args) throws IOException {
		 String str = "Hello";
		    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Home_Admin\\Desktop\\New folder\\gd.txt"));
		    writer.write(str);
		    
		    writer.close();
	}
}
