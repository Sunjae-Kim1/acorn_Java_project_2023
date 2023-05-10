package test.main;
/*
 * 1. 산술연산자
 * 
 *  + , - , * , / , %
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num1 =5;
		int num2 = 2;
		
		// + 연산
		int sum = 10 + 1;
		int sum2 = num1 + num2;
		int sum3 = 10 + num2;
		
		// 정수끼리 연산하면 결과는 정수
		int result = 5 / 3;
		int result2 = num1 / num2;
		
		// 연산의 결과로 실수를 원할시 적어도 하나는 실수이어야 한다.
		double result3 = 5 / 3.0;
		double result4 = num1 / (double)num2;
		
		// 앞에 있는 수를 뒤에 있는 수로 나눈 나머지 값
		int result5 = num1 % num2;
	}
}