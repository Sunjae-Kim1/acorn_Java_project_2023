package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		// fruitBox 객체 생성 후 참조값을 box 지역변수에 대입
		FruitBox<Apple> box = new FruitBox<Apple>();
		// box 참조값을 이용해 pack() 호출
		box.pack(new Apple());
		// box 참조값을 이용해 unPack() 메소드 호출 , 리턴 값을 fruit 지역변수에 대입
		Apple fruit = box.unPack();
		
		// 생성한 박스에 Melon 을 대입 가능 확인
		FruitBox<Melon> box2 = new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon friut2 = box2.unPack();
		
		// Orange 테스트
		FruitBox<Orange> box3 = new FruitBox<>(); // 객체 생성 시 Generic 클래스 생략 가능
		box3.pack(new Orange());
		Orange fruit3 = box3.unPack();
		
	}
}