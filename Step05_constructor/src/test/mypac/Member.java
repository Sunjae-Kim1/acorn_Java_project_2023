package test.mypac;

public class Member {
	// 필드
	public int num;
	public String name;
	public String addr;
	
	// 메소드
	public void printInfo() {
		System.out.println("번호:" + num + " 이름:" + name + " 주소:" + addr);
	}
	
	// 생성자
	public Member(int num , String name , String addr) {
		// 생성자의 매개변수에 전달된 값을 필드에 저장
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	// Default 생성자
	public Member() {}
}