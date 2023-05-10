package test.mypac;

public class MyWeapon extends Weapon {

	// 부모 클래스의 추상 메소드를 반드시 ( = 강제로 ) 오버라이드 해야한다.
	@Override
	public void attack() {
		// 어디에서 시작할지 상황에 맞게 한다.
		System.out.println("지상 공격합니다.");
	}
}