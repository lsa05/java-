package thisisjava;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//OutputStreamWriter
public class Ex14 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("C:/Temp/file.txt");	//바이트 기반 스트림을
		Writer writer = new OutputStreamWriter(fos);					//문자 기반 스트림으로 변환
		
		String data="바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		fos.close();
		System.out.println("파일 저장이 끝났습니다.");

	}

}
