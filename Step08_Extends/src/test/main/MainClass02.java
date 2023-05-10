package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 지역변수나 필드 앞에 선언하는 Data Type 은 ( 참조 데이터 Type )
 * 
 * 그 안에 들어있는 참조값의 사용 설명서라고 표현 가능
 * 
 * 그렇기에 지역변수나 필드에 '.' 을 찍으면 사용 설명서에 명시된 기능을 사용 가능
 * 
 *  java 의 모든 객체는 다형성을 가질 수 있다.
 *  
 *  다형성은 Type 이 여러 개라는 것이다.
 */

public class MainClass02 {
	public static void main(String[] args) {
		// HandPhone 객체 생성 후 나온 참조값을 HandPhone Type 지역변수 p1 에 담기
		HandPhone p1 = new HandPhone();
		
		// HandPhone 객체 생성 후 나온 참조값을 Phone Type 지역변수 p1 에 담기
		Phone p2 = new HandPhone();
		
		// HandPhone 객체 생성 후 나온 참조값을 Object Type 지역변수 p1 에 담기
		Object p3 = new HandPhone();
	}
}