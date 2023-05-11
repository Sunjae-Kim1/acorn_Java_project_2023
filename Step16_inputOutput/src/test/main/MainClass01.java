package test.main;

import java.io.IOException;
import java.io.InputStream;

import javax.print.DocFlavor.INPUT_STREAM;

/*
 * 입력 , 출력 ( input , output )
 * 
 * - 어떤 대상으로부터 데이터를 메모리로 읽어 들이는 것을 입력이라 한다.
 * - 프로그래밍 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체 로 생각하면 된다.
 * - 데이터는 2진수로 이루어져 있지만 2진수 8개의 묶음인 1 byte 단위로 생각하면 된다.
 * - 1 byte 는 총 256 가지의 값을 표현 가능하다.
 * - 1 byte 는 10 진수로 환산하면 0 ~ 255 사이의 숫자 중 하나이다.
 * - 입력 , 출력 통해서 이동하는 데이터는 byte 하나 하나가 이동한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작했습니다.");
		// 키보드와 연결된 inputStream Type 의 참조값을 kbd 라는 지역변수에 대입
		// inputStream 객체는 1 byte 단위처리 스트림이다.
		// 영문자 대소문자 , 숫자 , 특수문자만 처리 가능
		// 한글 처리 불가
		InputStream kbd = System.in;
		
		try {
			System.out.print("입력:");
			// 입력한 키의 code 값 읽기
			int code = kbd.read();
			System.out.println("code:" + code);
			// code 값에 대응되는 문자 얻기
			char ch = (char)code;
			System.out.println("ch:" + ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료했습니다.");
	}
}