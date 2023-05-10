package test.main;

/*
 * While 문을 활용해 원하는 횟수만큼 반복
 * 
 * - 반복 횟수가 명확히 정해져 있으면 for 문으로 반복문을 돌린다.
 * - 반복 횟수가 명확히 정해져 있지 않고 반복문을 돌아봐야 횟수를 알면 While 문으로 돌린다. 
 */

public class MainClass09 {
	public static void main(String[] args) {
		// 카운트를 셀 변수를 미리 만들어 0 으로 초기화
		int count = 0;
		
		// 무한 루프
		while(true) {
			System.out.println("안녕!");
			count++;
			// 특정 조건 하에서 무한 루프 빠지기
			if(count == 5) {
				break;
			}
		}
		System.out.println("--------------------");
		
		int i = 0; // i 를 0 으로 초기화
		
		// i 가 5 보다 작은 동안 반복문 돌기
		while(i < 5) {
			// 원하는 작업하기
			System.out.println("안녕!");
			// i 사 1 증가
			i++;
		}
	}
}