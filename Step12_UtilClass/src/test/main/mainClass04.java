package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.mypac.Car;

public class mainClass04 {
	public static void main(String[] args) {
		// 1. Car Type 을 저장할 수 있는 ArrayList 객체를 생성해
		// 참조값을 List 인터페이스 Type 지역변수 cars 에 대입
		List<Car> cars = new ArrayList<>();
		
		// 2. Car 객체 3개를 생성해 List 객체에 저장
		cars.add(new Car("모닝"));
		cars.add(new Car("카니발"));
		cars.add(new Car("아반떼"));
		
		// 3. 일반 for 문을 이용해 List 객체에 저장된 모든 Car 객체의 drive() 메소드 순서대로 호출
		for(int i = 0; i < cars.size(); i++) {
			cars.get(i).drive();
		}
		// 4. 확장 for 문을 이용해 List 객체에 저장된 모든 Car 객체의 drive() 메소드 순서대로 호출
		for(Car tmp : cars) {
			tmp.drive();
		}
		// 5. Consumer 인터페이스를 활용해 List 객체에 저장된 모든 Car 객체의 drive() 메소드 순서대로 호출
		cars.forEach(new Consumer<Car>() {
			@Override
			public void accept(Car t) {
				t.drive();
			}
		});
	}
}