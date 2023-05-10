package test.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 * Car 클래스는 default 생성자가 없고
		 * Engine Type 의 참조값을 전달해야지만 호출되는 생성자를 가지고 있어서
		 * Car 객체를 생성하기 위해 Engine 객체의 참조값을 전달해야 한다.
		 */
		Car car1 = new Car(new Engine());
		car1.drive();
	}
}