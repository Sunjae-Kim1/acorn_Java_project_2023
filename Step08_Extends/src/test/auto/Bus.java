package test.auto;

public class Bus extends Car{

	// 부모 생성자에서 필요한 값을 자식 생성자에서 받아서 전달해 주는 코드가 있어야 가능
	public Bus(Engine engine) {
		// super() 호출 이전에 다른 코드를 한 줄이라도 실행 X
		
		// super() 는 부모 생성자를 표현
		super(engine);
	}
	
	// 메소드
	public void powerDrive() {
		if(this.engine == null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없습니다.");
			return;
		}
		System.out.println("빠르게 달립니다.");
	}
}