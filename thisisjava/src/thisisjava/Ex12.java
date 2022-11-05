package thisisjava;

import java.io.FileWriter;
import java.io.Writer;

public class Ex12 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
	
		String data = "안녕 자바 프로그램"; 	//문자열을 data에 저장
		//writer.write(data); 			 //write(String str)
		writer.write(data,3,2);			//3번지부터 2개만 출력한다."자바"
		
		writer.flush();
		writer.close();

	}

}
