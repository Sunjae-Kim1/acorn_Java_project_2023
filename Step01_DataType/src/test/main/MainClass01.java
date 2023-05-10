package test.main;
/*  
 *  [ Java 기본 데이터 type ]
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됐습니다.");
		// 정수형 변수 선언 후 값 대입
		byte iByte = 10;
		short iShort = 10;
		int iInt = 10000;
		long iLong = 10;
		
		/*
		 * int type 변수에 byte type 변수에 담긴 내용을 넣을 시
		 * 표현 가능 범위가 좁은 변수에 담긴 값을 표현 가능범위가 더 넓은 변수에 
		 * 대입은 문제 X
		 */
		int tmp = iShort;
		
		/*
		 * 표현 가능한 범위가 넓은 변수에 담긴 내용을 대입하려면
		 * casting 을 명시해야 한다.
		 */
		// byte tmp2 = iShort; Error 발생
		byte tmp2 = (byte)iShort;
		
		// 실수형 변수 선언 후 값 대입
		float num1 = 10.1f;
		double num2 = 10.2d;
		double num3 = 10.3; // d , f 을 붙이지 않으면 double type 으로 간주한다.
		
		// float type 값을 double type 에 대입
		double tmp3 = num1;
		
		float tmp4 = (float)num2; // casting 연산자
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
