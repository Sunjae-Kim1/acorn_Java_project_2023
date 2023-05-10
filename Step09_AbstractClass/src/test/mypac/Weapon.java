package test.mypac;

// 미완성된 추상 메소드를 멤버로 가지고 있는 추상 클래스는 abstract 예약어를 붙여서 정의해야 한다.
public abstract class Weapon {
	
	// 무기 작동을 준비하는 메소드
	public void prepare(){
		System.out.println("무기 작동을 준비합니다.");
	}
	
	// 공격을 하는 메소드의 모양만 정의하고 실제 구현 X
	// 미완성된 추상 메소드를 만들 시 abstract 예약어 필요
	public abstract void attack();
	
}