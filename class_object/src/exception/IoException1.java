package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IoException1  {
public static void main(String[] args)throws FileNotFoundException {
	FileInputStream fis=new FileInputStream("G:\\notes\\test.pdf");
}
}
