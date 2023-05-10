package test.mypac;

public class MyRemocon2 implements Remocon {
	@Override
	public void up() {
		System.out.println("Up");
	}

	@Override
	public void down() {
		System.out.println("Down");
	}
	
	// 메소드 추가
	public void reserve() {
		System.out.println("전원 OFF 예약했습니다.");
	}
}