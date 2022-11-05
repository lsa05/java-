package thisisjava;
//read()
import java.io.FileInputStream;
import java.io.InputStream;

//입출력
public class Ex01 {

	public static void main(String[] args) throws Exception {    //예외처리
		InputStream is =new FileInputStream("C:/Temp/test.txt"); //알파벳 1글자 1바이트
		int readByte; //변수선언
		while((readByte=is.read())!=-1) { 	//read메서드가 1바이트씩 읽는데 읽은 데이터가 readByte에 저장,이 값이 -1이 아니면
											//while문이 총 5번 돌게 됨 (저장 내용이 5바이트라)
		System.out.println(readByte);	  	//1바이트씩 읽은 내용 출력 -> 아스키코드값 출력됨
		System.out.println((char)readByte); //아스키코드값이 아닌 문자를 출력하고 싶을 땐 형변환
			
		}									//6번째는 읽을 것이 없어 -1이 출력되면 while문을 빠져나감
	}
	

}


