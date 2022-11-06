package thisisjava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

//BufferedInputStream
public class Ex15 {

	public static void main(String[] args) throws Exception {
		long start = 0; //시작하기 전 시간을 저장할 변수 선언
		long end =0;	//읽기 작업이 끝난 후 시간을 저장할 변수 선언
		
		// 버퍼를 사용하지 않았을 때
		FileInputStream fis1=new FileInputStream("C:/git lsa/java-/thisisjava/src/thisisjava/시계.png");
		start = System.currentTimeMillis(); //메서드를 사용해 현재 시간을 long값으로 저장
		while(fis1.read()!=-1) {}	//파일을 1바이트씩 읽어오도록 하고, 파일을 끝까지 읽으면 -1이 리턴되도록 함
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용하지 않았을 때:"+(end-start)+"ms");
		
		fis1.close();
		
		// 버퍼를 사용했을 때
		FileInputStream fis2=new FileInputStream("C:/git lsa/java-/thisisjava/src/thisisjava/시계.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis(); //메서드를 사용해 현재 시간을 long값으로 저장
		while(bis.read()!=-1) {}	//파일을 1바이트씩 읽어오도록 하고, 파일을 끝까지 읽으면 -1이 리턴되도록 함
		end = System.currentTimeMillis();
		System.out.println("버퍼 사용했을 때:"+(end-start)+"ms");
		
		bis.close();
		
	}

}
