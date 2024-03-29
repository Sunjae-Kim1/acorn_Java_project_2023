package test.main;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		// 개발자가 코딩하는 위치
		
		// 달리기는 하는데...
		useCar(new Car());
		
		// 조금 더 빨리 달렸으면.....
		// 누군가 미리 만들어 놓은 Car 클래스의 drive() 메소드를 수정하는 것은 불가능
		// 방법은 ???
		useCar(new Car() {
			@Override
			public void drive() {
				System.out.println("더 빨리 달립니다.");
			}
		});
	}
	
	// 누군가 미리 만들어 놓은 메소드
	public static void useCar(Car c) {
		c.drive();
		c.drive();
	}
}