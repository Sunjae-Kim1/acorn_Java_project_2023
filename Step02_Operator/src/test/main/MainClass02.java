package test.main;
/*
 *  증감 연산자 테스트
 *  변수에 있는 숫자 값을 1 씩 증가 혹은 1 씩 감소할 때 사용한다.
 *  ++ , --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num++;
		num++;
		num++; // 결과 3
		
		int num2 = 0;
		num2--;
		num2--;
		num2--; // 결과 -3
		
		int num3 = 0;
		int result1 = num3++; // 결과 result1 에 0 이 대입되고 num3 은 1 이 된다.
		
		int num4 = 0;
		int result2 = ++num4; // 결과 result1 에 1 증가한 num4 값이 대입
	}
}