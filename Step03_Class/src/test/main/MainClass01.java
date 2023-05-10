package test.main;

import test.mypac.Car;

public class MainClass01 {
	// run 실행 시 흐름이 시작하는 특별한 메소드
	public static void main(String[] args) {
		
		/*
		 * Car 클래스로 객체를 생성 후 
		 * 생성된 객체의 참조 값을 car1 이라는 지역 변수에 담기
		 */
		Car car1 = new Car();
		
		// Car 객체의 참조 값에 ' . ' 찍어서 메소드 호출
		car1.drive();
		
		// Car 객체의 참조 값에 ' . ' 찍어서 필드 참조하기 ( 참조해서 값 대입 )
		car1.name = "소나타";
		car1.price = 1000;
		
		Car car2 = new Car();
		car2.drive();
		car2.name = "그랜저";
		car2.price = 2000;
		
		boolean result = car1 == car2; // false
		boolean result2 = car1.name == car2.name; // false
		
	}
}