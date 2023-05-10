package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

/*
 * [ 추상 클래스 ( Abstract Class ) ]
 * 
 * - class 예약어 앞에 abstract 명시해서 클래스를 정의
 * - 형태만 정의하고 , 실제 구현은 되지 않는 메소드가 존재할 수 있다.
 * - 형태만 정의된 메소드를 만들 시 abstract  예약어를 붙여서 메소드를 정의한다.
 * - 생성자는 존재하지만 , 단독으로 객체 생성은 불가
 * - 추상 클래스는 Type 의 참조값이 필요하면 
 *    추상 클래스를 상속받은 자식 클래스를 정의해서 객체 생성
 * - 추상 클래스를 상속 받은 자식 클래스는 
 *    부모의 추상 메소드를 모두 오버라이드 ( = 재정의 ) 한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// Weapon Type 참조값을 담을 빈 지역변수 w1
		Weapon w1 = new MyWeapon();
		w1.attack();
		w1.prepare();
	}
}