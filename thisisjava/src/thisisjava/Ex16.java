package thisisjava;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//BufferedReader
public class Ex16 {

	public static void main(String[] args) throws Exception{
		InputStream is= System.in; //콘솔로 입력된 문자를 읽어들이는 InputStream
		Reader reader = new InputStreamReader(is); //Reader로 변환 , InputStream에 연결된 보조스트림1(바이트->문자 변환)
		BufferedReader br = new BufferedReader(reader); //입력 성능을 향상시키는 BufferedReader, InputStream에 연결된 보조스트림2(문자기반스트림에 버퍼를 제공)
		
		System.out.print("입력:");
		String lineString = br.readLine();  //엔터를 치기 전 한 행을 읽도록 하는 메서드
		System.out.println("출력:"+lineString);
		
		br.close();
		reader.close();
		is.close();
	}

}
