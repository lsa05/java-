package thisisjava;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03 {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt"); //5byte 저장되어 있음
		int readByteNo;										//변수 선언 -> 이 변수는 read메서드가 읽은 바이트 수를 저장할 것임
		String data = ""; 									//변수선언 -> 읽은 문자열을 저장할 String타입 변수를 하나 선언
		byte[] readBytes = new byte[8];	
		readByteNo = is.read(readBytes, 2, 3);				//읽은 데이터를 2번지부터 3개만 readBytes에 저장
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);				//i번째 값 출력
			System.out.println((char)readBytes[i]);			//아스키코드를 문자로 변환
		}

	}

}
