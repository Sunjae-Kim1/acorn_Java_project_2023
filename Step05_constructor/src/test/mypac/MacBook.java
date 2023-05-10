package test.mypac;

public class MacBook {
	// 외부에서 접근 불가하도록 접근 지정자를 private 로 3 개를 선언
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	// 생성자
	public MacBook(Cpu cpu , Memory memory , HardDisk hardDisk) {
		// 생성자의 매개변수에 전달된 값을 필드에 저장
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
	
	// 메소드
	public void doGame() {
		if(this.cpu == null || memory == null || hardDisk == null) {
			System.out.println("부품이 부족해서 게임 실행 불가");
			return; // 메소드 종료
		}
		System.out.println("게임 시작합니다.");
	}
}