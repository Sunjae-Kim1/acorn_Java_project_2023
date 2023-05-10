package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		// 아래의 useWeapon() 메소드를 호출하려면 Weapon Type 의 참조값이 필요
		// 익명의 Local Inner Class 를 이용해서 Weapon Type  의 참조값을 얻어서 사용
		Weapon w = new Weapon() { // 이름이 없는 익명의 클래스 , extends Weapon 한 클래스
			@Override
			public void attack() {
				System.out.println("무작위 공격합니다.");
			}
		};
		
		useWeapon(w);
		
		// 메소드를 호출 시 익명 클래스를 이용해 Weapon Type  의 참조값을 얻어서 사용
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("김구라 공격합니다.");
			}
		}); // useWeapon()
		
	}
	// Weapon Type 의 참조값을 전달받아 사용하는 Static 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}