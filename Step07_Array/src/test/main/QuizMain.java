package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 1. run 실행 시
		 * 
		 * cherry , apple , banana , melon , 7
		 * 5 개의 문자열 중에서 1개가 랜덤으로 출력
		 */
		Random ran = new Random();
		String[] str = {"cherry" , "apple" , "banana" , "melon" , "7"};
		
//		String[] str = new String[5];
//		str[0] = "cherry";
//		str[1] = "apple";
//		str[2] = "banana";
//		str[3] = "melon";
//		str[4] = "7";
		
		int i = ran.nextInt(5);
		System.out.println(str[i]);
	}
}