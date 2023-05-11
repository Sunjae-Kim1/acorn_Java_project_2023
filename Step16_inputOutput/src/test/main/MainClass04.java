package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		// 콘솔 창에 연결된 객체의 참조값
		PrintStream ps = System.out;
		//OutputStream 도 1 byte 처리 스트림이다.
		OutputStream os = ps;
		try {
			os.write(77);
			os.write(19);
			os.write(143);
			os.flush(); // 방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}