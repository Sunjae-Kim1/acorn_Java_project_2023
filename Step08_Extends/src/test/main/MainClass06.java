package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		// 자식에게 사준 일반 핸드폰 ( 인터넷 안됨 )
		HandPhone p1 = new HandPhone();
		
		// 핸드폰은 그대로 구형인데 안드로이드 폰 설명서만 가져옴
		AndroidPhone p2 = (AndroidPhone)p1; // ClassCastException 발생
		
		// 설명서 믿고 인터넷해봄
		p2.doInternet();
	}
}