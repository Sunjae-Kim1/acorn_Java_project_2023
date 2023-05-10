package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 기본 데이터 Type double
		double num1 = 10.1;
		// 참조 데이터 Type Double
		Double num2 = 10.2;
		
		// 참조 데이터 Type Double  이지만 기본 데이터 Type 과 같이 사용 가능
		double result1 = num2 + 10;
		double result2 = num1 + num2;
		Double result3 = num1 + num2;
		
		// 문자열을  숫자 ( double ) 로 바꾸기 "10.3" -> 10.3
		double result4 = Double.parseDouble("10.3");
	}
}