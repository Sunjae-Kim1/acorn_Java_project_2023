package test.main;
/*
 * 4.	논리연산자 테스트
 */
public class MainClass04 {
	public static void main(String[] args) {
		// OR 연산
		/*
		 * ' 또는 ' 이라고 읽는다.
		 * 
		 * 어느 한 쪽이 true 면 결과는 true
		 * 양 쪽 모두가 false 면 결과는 false
		 */
		boolean result1 = false || false; // false
		boolean result2 = false || true; // true
		boolean result3 = true || false; // true
		boolean result4 = true || true; // true
		
		// AND 연산
		/*
		* ' 그리고 ' 이라고 읽는다.
		* 
		* 양 쪽이 true 일때만 결과는 true
		* 어느 한 쪽이라도  false 면 결과는 false
		*/
		boolean result5 = false && false; // false
		boolean result6 = false && true; // false
		boolean result7 = true && false; // false
		boolean result8 = true && true; // true
		
		// NOT 연산
		/*
		 * ' ~ 가 아니면 ' 이라고 읽는다.
		 * 
		 * boolean 값을 반전한다.
		 */
		boolean result9 = !true; // false
		boolean result10 = !false; // true
	}
}