package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "소나타";
		car1.price = 1000;
		car1.drive();
		
		/*
		 * 아래의 메소드를 호출 시
		 * 
		 * 차의 이름은 소나타 , 가격은 1000 만원 입니다.
		 * 
		 * 라고 출력되도록 Car 클래스의 showInfo() 메소드 안에 내용 작성
		 */
		car1.showInfo();
	}
}