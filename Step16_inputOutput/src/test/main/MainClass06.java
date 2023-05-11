package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		// OutputStream 도 1 byte 처리 스트림
		OutputStream os = ps;
		// 2 byte 처리 스트림
		OutputStreamWriter osw = new OutputStreamWriter(os);
		// 더 좋은 기능을 가진 BufferedWriter 객체
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			bw.write("하나\r\n");
			bw.write("두울");
			bw.newLine(); // 개행 기호를 출력하는 메소드
			bw.write("세엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}