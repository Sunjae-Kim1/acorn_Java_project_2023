package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// Car 객체를 생성해서 사용하지 않고 버림
		new Car();
		
		// Car 객체를 생성해서 1 번 사용 후 버림( 객체를 1 회용 사용 )
		new Car().drive();
		
		// 객체를 생성해서 나온 참조 값을 c1 이라는 Car Type 지역변수에 담고
		Car c1 = new Car();
		// 필요 시마다 c1 에 ' . ' 찍어서 여러번 사용 가능
		c1.drive();
		c1.drive();
		
		// drive() 메소드는 리턴 Type 이 void 이기 때문에 아래의 코드는 성립 X
		// Car c2 = new Car().drive();
	}
}
