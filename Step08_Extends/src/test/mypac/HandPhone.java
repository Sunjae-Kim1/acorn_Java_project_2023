package test.mypac;

public class HandPhone extends Phone{
	// 생성자
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출");
	}
	
	// 메소드
	public void mobileCall() {
		System.out.println("이동중에 전화를 겁니다.");
	}
	
	// 사진 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍습니다.");
	}
}