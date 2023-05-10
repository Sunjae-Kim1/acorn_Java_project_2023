package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		//System.out.println("main 메소드가 시작했습니다.");
		
		// 키보드로 부터 입력받는 기능을 가진 객체 생성
		Scanner scan = new Scanner(System.in);
		// 개행 기호를 출력하지 않고 콘솔 창에 문자열 출력 .print() 메소드를 활용
		System.out.print("문자열 입력 : ");
		// 문자열 한 줄 입력 받고
		String str = 	scan.nextLine();
		// 입력 받은 문자열을 콘솔에 출력
		System.out.println(str);
		System.out.println("main 메소드가 종료했습니다.");
	}
}