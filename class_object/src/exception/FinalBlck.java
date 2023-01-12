package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinalBlck {
public static void main(String[] args) throws IOException {
	FileInputStream fis=null;
	try {
		fis=new FileInputStream("c:\\desktop\test.pdf");
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	finally {
		fis.close();
	}
}
}
