package thisisjava;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex04 {
//Write(int b)
	
	public static void main(String[] args) throws Exception{	//fileoutputstream이 예외를 생성할 수 있는 스트림이라 예외처리 
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes(); 						//"ABC"라는 byte배열을 얻을 수 있음
		for(int i=0; i<data.length;i++) {
			os.write(data[i]); 									//OutputStream 출력스트림을 통해서 한바이트씩 저장, 이때 write(int b)매서드 사용
		}				
		
		os.flush(); 											//버퍼가 꽉 차야 그 내용이 출력이 되는데, 버퍼가 빈 공간이 있어도 강제로 출력하도록 해줌
		os.close();
	}
	
}
