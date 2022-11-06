package thisisjava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex18 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat"); //기본 타입의 데이터를 저장하기 때문에 .dat에는 바이트 타입의 데이터가 저장됨 
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동"); //문자열 출력하고 싶을 때
		dos.writeDouble(95.5); //double값 출력하고 싶을 때
		dos.writeInt(2); //int값 출력하고 싶을 때
	
		dos.flush(); dos.close(); fos.close();
	
		//데이터 읽기
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
		DataInputStream dis = new DataInputStream(fis); 	//fis를 매개로 하여 읽기
		
		String name = dis.readUTF(); //"홍길동"읽어옴  *순서대로 작성해야 함
		double score = dis.readDouble();
		int order = dis.readInt();
		
		System.out.println(name + ":" + score + ":" + order );
		
		dis.close(); fis.close();
	}

}
