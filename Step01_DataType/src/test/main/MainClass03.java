package test.main;
/*
 * [ Java 기본 데이터 Type ]
 * 
 * 2. 논리형 타입 ( boolean )
 * 
 * true , false 두 가지 값 중 하나이다.
 * true , false 를 직접 쓰거나 비교연산 , 논리연산의 결과로 얻을 수 있다.
 * 참 과 거짓을 나타내는 데이터 Type 
 */
public class MainClass03 {
	public static void main(String[] args) {
		// 논리형 변수 선언 후 동시 값 대입
		boolean isRun = true;
		
		if(isRun) {
			System.out.println("달립니다!!!");
		}
		
		// 비교 연산의 결과로 얻은 boolean 값 담기
		boolean isGreater = 10 > 1;
		
		// 논리 연산의 결과로 얻은 boolean 값 담기
		boolean result = true || false;
		
		 // boolean result = false; 변수를 중복 선언 불가
		
		result = false;
		
		// result = 10; 다른 Type 이 값을  변수에 대입 불가
		
		
	}
}