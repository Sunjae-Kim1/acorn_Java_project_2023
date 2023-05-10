package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car 객체를 생성 후 참조 값을 Car Type 지역변수 car1 에 담기
		Car car1 = new Car();
		// car1 에 담긴 참조 값을 Car Type 지역변수 car2 에 담기
		Car car2 = car1;
		// Car Type 의 참조 값을 담을 수 있는 지역변수 car3 에 담기
		Car car3 = null;
		
		car1.name = "아반떼";
		String a = car1.name;
		String b = car2.name;
		
		car1.drive();
		car2.drive();
		// NullPointerException 발생 car3 변수 안에는 참조 값이 없음
		// car3.drive();
	}
}