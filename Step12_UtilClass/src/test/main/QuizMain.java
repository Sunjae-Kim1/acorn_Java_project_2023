package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		// 1. 키보드로부터 문자열을 입력받는 Scanner 객체를 이용해 scan 지역변수에 대입
		Scanner scan = new Scanner(System.in);
		
		// 2. 문자열을 저장 가능한 ArrayList 객체를 생성해 msgs 지역변수에 대입
		List<String> msgs = new ArrayList<>();
		
		// 3. 반복문 5번 돌려 문자열을 5번 입력 받는데 입력받은 문자열을 ArrayList 객체에 순서대로 저장
		for(int i = 0; i < 5; i++) {
			System.out.print("입력: ");
			msgs.add(scan.nextLine());
		}
		
		// 4. 반복문을 활용해 ArrayList 에 담긴 모든 문자열을 순서대로 출력
		for(int i = 0; i < msgs.size(); i++) {
			System.out.println(msgs.get(i));
		}
	}
}