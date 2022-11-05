package thisisjava;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] date = "ABC".getBytes();
		os.write(date);   //date라는 byte배열을 줌
		os.flush();
		os.close();
	}


}
