package test.main;
/*
 * 6. 3 항 연산자 테스트
 */
public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait = true;
		// isWait 가 true 이면 '?' 뒤 전자가 대입되고 
		// false 이면 후자가 대입된다.
		String result = isWait ? "기다립니다." : "기다리지 않습니다.";
		// int result2 = isWait ? 1 : 0;
		
		System.out.println(result);
		
		// 위의 3 항 연산자는 아래와 같이 if ~ else 문과 같은 로직
		String result2 = null;
		if(isWait) {
			result2 = "기다립니다";
		}else {
			result2 = "기다리지 않습니다.";
		}
		System.out.println(result2);
		
	}
}