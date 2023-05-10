package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. 문자열을 저장할 수 있는 방 5개짜리 배열객체를 생성 후 참조값을 msgs 라는 지역변수에 담기
		String[] msgs = new String[5];
		// 2. 키보드로 입력 받는 Scanner 객체를 생성 후 참조값을 scan 이라는 지역변수에 담기
		Scanner scan = new Scanner(System.in);
		// 3. 반복문으로 위 1번 생성한 배열의 방의 갯수만큼 돌려서 키보드로부터 입력한 문자열을 받아서
		// 배열에 순서대로 넣기
		for(int i = 0; i < msgs.length; i++) {
			System.out.print("입력하세요 : ");
			msgs[i] = scan.nextLine();
		}
		// 4. 반복문으로 배열에 넣었던 모든 문자열을 순서대로 콘솔 창에 출력
		for(int i = 0; i < msgs.length; i++) {
			System.out.println(msgs[i]);
		}
//		for(String tmp : msgs) {
//			System.out.println(tmp);
//		}
	}
}