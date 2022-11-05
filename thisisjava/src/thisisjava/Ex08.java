package thisisjava;

import java.io.FileReader;
import java.io.Reader;

public class Ex08 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt"); 	//FileReader 생성
		int readCharNo; //reader가 읽은 문자수를 저장할 변수 선언
		char[] cbuf = new char[4]; //reader가 읽은 데이터를 저장할 배열 생성, 길이 2
		readCharNo=reader.read(cbuf, 1, 2); //1번지부터 2개 읽어서 저장
		for(int i=0; i<cbuf.length;i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();

	}

}
