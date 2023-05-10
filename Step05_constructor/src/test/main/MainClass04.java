package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * Java.util 패키지에 있는 Random 클래스 사용하기
		 */
		Random ran = new Random();
		
		// 0 ~ 9 사이의 정수를 얻어 ranNum  지역변수에 담기
		int ranNum = ran.nextInt(0,10);
		// int ranNum = ran.nextInt(10);
		
		// ranNum 지역변수의 내용을 콘솔 창에 출력
		System.out.println(ranNum);
	}
}