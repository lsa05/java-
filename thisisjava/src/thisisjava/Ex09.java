package thisisjava;

import java.io.FileWriter;
import java.io.Writer;

public class Ex09 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();  //"홍길동"이라는 문자열로부터 char배열을 얻음
		for(int i=0; i<data.length;i++) {
			writer.write(data[i]);	 //write()를 사용해서 한문자씩 출력
		}
		writer.flush();
		writer.close();

	}
}
