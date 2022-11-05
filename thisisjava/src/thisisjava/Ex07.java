package thisisjava;

import java.io.FileReader;
import java.io.Reader;

public class Ex07 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt"); 	//FileReader 생성
		int readCharNo; //reader가 읽은 문자수를 저장할 변수 선언
		String data=""; 
		char[] cbuf = new char[2]; //reader가 읽은 데이터를 저장할 배열 생성, 길이 2
		while((readCharNo=reader.read(cbuf))!=-1) { //read()메서드가 읽은 문자는 readCharNo에 저장하고, 읽은 데이터는 cbuf에 저장한다.
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
	}

}
