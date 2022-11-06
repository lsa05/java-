package thisisjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//
public class Ex17 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data =-1; 							//읽은 바이트를 저장할 변수, -1값을 초기값으로 줌
		long start =0; 							//복사 전 시간 저장 변수
		long end = 0; 							//복사 후 시간 저장 변수
		
		
		//출력스트림에 버퍼를 사용하지 않았을 때
		
		fis = new FileInputStream("C:/git lsa/java-/thisisjava/src/thisisjava/시계.png"); 
		bis = new BufferedInputStream(fis); 					//입력스트림에 버퍼를 사용
		fos = new FileOutputStream("C:/Temp/시계.png");			//복사 할 곳
		start = System.currentTimeMillis(); 
		while((data=bis.read())!=-1) { 							//bis에서 1바이트를 읽어서 data에 저장
			fos.write(data); 									//data를 읽게되면 fos에 wirte메서드를 이용해서 data출력		
		}
		fos.flush();
		end = System.currentTimeMillis(); 
		
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("출력스트림에 버퍼를 사용하지 않았을 때: "+ (end-start)+"ms");
		
		
		
		
		
		//출력스트림에 버퍼를 사용했을 때
		
		fis = new FileInputStream("C:/git lsa/java-/thisisjava/src/thisisjava/시계.png"); 
		bis = new BufferedInputStream(fis); 
		fos = new FileOutputStream("C:/Temp/시계.png"); 
		bos = new BufferedOutputStream(fos);   					//버퍼 사용
		start = System.currentTimeMillis(); 
		while((data=bis.read())!=-1) { 
			bos.write(data); 	
		}
		fos.flush();
		end = System.currentTimeMillis(); 
		
		fos.close();
		bis.close();
		fis.close();
		
		
		System.out.println("출력스트림에 버퍼를 사용했을 때: "+ (end-start)+"ms");
		
	}

}
