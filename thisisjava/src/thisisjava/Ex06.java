package thisisjava;

import java.io.FileReader;
import java.io.Reader;

public class Ex06 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt"); 	//FileReader 생성
		int readData;											//변수 생성, reader가 읽은 1문자를 저장하기 위해.
		
		while((readData=reader.read())!=-1) {					//read()메서드를 통해 reader로부터 1문자씩 읽는데, 읽은 데이터는 readData에 int로 저장됨
																//int는 4바이트이고, 데이터는 2바이트 이므로 끝에 2바이트에 저장됨
			System.out.print((char)readData);
		}				
		reader.close();
	}
}
