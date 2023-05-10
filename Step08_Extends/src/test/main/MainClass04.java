package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		// HandPhone 객체를 생성 후 참조값을 Object Type p3 지역변수에 대입
		Object p3 = new HandPhone();
		
		// Object Type p3 변수에 담긴 값을  Phone Type p2 변수에 담기
		Phone p2 = (Phone)p3; // casting
		
		// Object Type p3 변수에 담긴 값을  HandPhone Type p1 변수에 담기
		HandPhone p1 = (HandPhone)p3;
	}
}