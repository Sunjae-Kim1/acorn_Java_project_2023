package test.main;
/*
 * [ Java 기본 데이터 Type ]
 * 2. 문자형 ( Char )
 * 
 * 65536 가지의 코드 값을 가진다.
 * 전 세계에서 사용하는 모든 문자 1 글자를 표현 가능
 * Single Quotation ( '' ) 이용해서 만든다.
 */
public class MainClass04 {
	// run 실행 시 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작합니다.");
		// char 형 변수 선언과 동시에 값 대입
		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = 'c';
		char ch4 = '가';
		char ch5 = '나';
		char ch6 = '다';
		char ch7 = '@';
		
		// 정수값에 1:1 대응되는 char 값이 존재
		int code1 = ch1;
		int code2 = ch2;
		int code3 = ch3;
		int code4 = ch4;
		int code5 = ch5;
		int code6 = ch6;
	}
}
