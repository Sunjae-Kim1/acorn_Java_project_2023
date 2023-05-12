package test.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 파일 copy 연습
 */
public class MainClass09 {
	public static void main(String[] args) {
		
		// 필요한 참조값을 담을 지역 변수 만들기
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/acorn202304/myFolder/1.jpg");
			fos = new FileOutputStream("C:\\acorn202304\\myFolder\\copied2.jpg");
			
			// byte 를 읽을 배열 준비
			byte[] buffer = new byte[1024];
			
			// 반복문 돌면서
			while(true) {
				// byte[] 배열을 전달해 byte 를 한번에 1024 개씩 읽는다.
				int readedCount = fis.read(buffer);
				if(readedCount == -1)break; // 다음 수가 없으면 탈출
				// byte[] 배열에 저장된 byte 를 출력
				fos.write(buffer , 0 , readedCount);
				fos.flush();
			}
			System.out.println("파일을 복사했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null)fos.close();
				if(fis != null)fis.close();
			}catch(Exception e) {}
		}
	}
}