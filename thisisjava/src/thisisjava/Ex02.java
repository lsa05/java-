package thisisjava;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {

	public static void main(String[] args) throws Exception{      //예외처리
		InputStream is = new FileInputStream("C:/Temp/test.txt"); //5byte 저장되어 있음
		int readByteNo;										//변수 선언 -> 이 변수는 read메서드가 읽은 바이트 수를 저장할 것임
		String data = ""; 									//변수선언 -> 읽은 문자열을 저장할 String타입 변수를 하나 선언
		byte[] readBytes = new byte[3];						//길이 3짜기 바이트배열 생성
	
		while((readByteNo = is.read(readBytes))!=-1) { 		//read메서드를 호출하여, 읽은 데이터는 매개변수인 readBytes에 저장, 읽은 바이트 수는 readByteNo에 저장
			System.out.println(readByteNo);					//첫번째에 3byte읽음 -> 두번째에 나머지 2byte읽음
			data+=new String(readBytes, 0, readByteNo); 	// readBytes에 저장된 데이터를 0번지부터 readByteNo에 저장된 바이트수만큼 읽어서 String으로 표현
															//while문이 1번씩 돌때마다 문자열이 1씩저장되므로, +=로 누적해준다.
		}
		System.out.println(data);
	}
}
/*		while(true){
 *  		readByteNo=is.read(readBytes);
 * 			if(readByteNo == -1) break;
 * 			System.out.println(readyByteNo);
 * */	
