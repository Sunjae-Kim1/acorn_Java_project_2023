package test.main;

import test.mypac.AndroidPhone;

public class MainClass05 {
	public static void main(String[] args) {
		// AndroidPhone 객체 생성 후 참조값을 AndroidPhone Type p1 지역변수에 대입
		AndroidPhone p1 = new AndroidPhone();
		
		// 메소드 호출
		p1.call();				// Phone 객체의 기능
		p1.doInternet();		// AndroidPhone 객체의 기능
		p1.mobileCall();		// HandPhone 객체의 기능
		p1.showPlatform();	// AndroidPhone 객체의 기능
		p1.takePicture();		// HandPhone 객체의 기능
		
		
	}
}