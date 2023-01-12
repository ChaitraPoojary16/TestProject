package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo2 {
public static void main(String[] args)throws IOException,ClassNotFoundException,Exception {
	String filepath="C:\\Users\\chaitra\\Desktop\\Java\\email_file.txt";
	Demo d1=new Demo("sunil",30,102);
	FileOutputStream fos=new FileOutputStream(filepath);
	ObjectOutputStream os=new ObjectOutputStream(fos);
	os.writeObject(d1);
	os.close();
	System.out.println("Object converted to byte stream or serialized");
	FileInputStream fis=new FileInputStream(filepath);
	ObjectInputStream is=new ObjectInputStream(fis);
	Demo obj=(Demo)is.readObject();
	is.close();
	System.out.println("Byte stream converted to object or deserialized");
	System.out.println(obj.name);
	System.out.println(obj.age);
	System.out.println(obj.id);
}
}
