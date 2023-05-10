package test.main;
/*
 * 3. 	비교연산자 테스트
 * 		비교연산의 결과는 boolean type 을 반환
 * 		-- , != , > , >= , < , <=
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean result1 = 10 == 10; // true
		boolean result2 = 10 != 10; // false
		boolean result3 = 10 > 100; // false
		boolean result4 = 10 >= 10; // true
		boolean result5 = 10 < 100; // true
		boolean result6 = 10 <= 10; // true
		
		//String 변수 name 에 null 대입
		String name = null;
		
		// null 인지 아닌지 비교 가능 ( java 에서 null  값은 비교 가능 )
		boolean result7 = name == null; // true
		boolean result8 = name != null; // false
	}
}