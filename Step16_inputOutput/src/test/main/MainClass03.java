package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		// 문자열 1줄씩 입력받는 객체
//		BufferedReader br = new BufferedReader(isr);
		
		// 위 3줄 간단 요약
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 1줄 입력:");
		try {
			// BufferedReader 객체의 readLine() 메소드를 이용해 문자열 1줄 읽기
			String line = br.readLine();
			System.out.println("line:" + line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}