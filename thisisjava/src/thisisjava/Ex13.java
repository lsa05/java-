package thisisjava;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//보조스트림-InputStreamReader
public class Ex13 {

	public static void main(String[] args) throws Exception {
		InputStream is= System.in;//바이트 기반 스트림
		Reader reader = new InputStreamReader(is); //문자기반스트림으로 변환, InputStream을 매개로 함
		
		int readCharNo;
		char[]cbuf=new char[100];
		while((readCharNo=reader.read(cbuf))!=-1) {//read가 문자 읽음, readCharNo는 읽은 문자수
			String data = new String(cbuf, 0, readCharNo); //cbuf에서 0번지부터 읽은문자수만큼 변환
			System.out.println(data);
		}
			reader.close();
			is.close();
	}

}
