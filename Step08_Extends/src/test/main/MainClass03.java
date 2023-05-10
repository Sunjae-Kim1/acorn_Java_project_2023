package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해 그 참조값을 p1 이라는 이름의 HandPhone Type 지역변수에 대입
		HandPhone p1 = new HandPhone();
		
		// p1 안에 있는 참조값을 p2 라는 Phone Type 지역변수에 대입
		Phone p2 = p1;
		
		// p1 안에 있는 참조값을 p3 라는 Object Type 지역변수에 대입
		Object p3 = p1;
		
		// 자식 객체의 참조값은 부모의 Type 변수나 필드에 담긴다.
	}
}