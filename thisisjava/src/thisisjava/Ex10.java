package thisisjava;

import java.io.FileWriter;
import java.io.Writer;

public class Ex10 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data="홍길동".toCharArray();
		writer.write(data); 	//char배열에 있는 전체 문자를 출력 
	
		writer.flush();
		writer.close();
	}
}
