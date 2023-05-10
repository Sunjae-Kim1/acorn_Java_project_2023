package test.mypac;
/*
 * [ 메소드를 만들 때 고려 해야 하는 것 ]
 * 
 * 1. 접근 지정자 ( 모르면 public )
 * 2. static or non static ( 모르면 non static )
 * 3. 리턴 Type ( 모르면 void )
 * 4. 메소드 명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터 Type
 */
public class Test {
	public void walk() {
		System.out.println("걷습니다.");
	}
	public int getNumber() {
		return 10; // int 만 가능
	}
	public String getGreeting() {
		return "Hello World"; //String 만 가능
	}
	public Airplane getPlane() {
		// return new Airplane();
		Airplane ap = new Airplane();
		return ap;
	}
	// int Type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		
	}
	// String Type 을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		
	}
	// Airplane Type 을 메소드의 인자로 전달 받는 메소드
	public void setPlane(Airplane ap) {
		
	}
	// int , String , Airplane Type 3 개를 전달 받는 메소드
	public void doSomething(int sum , String name , Airplane plane) {
		
	}
	
	public void send() {
		System.out.println("전송합니다.");
	}
	public void send(int num) {
		System.out.println(num + " 을 전송합니다.");
	}
	public void send(String name) {
		System.out.println(name + " 을 전송합니다.");
	}
	public void send(Airplane plane) {
		System.out.println("비행기를 전송합니다.");
	}
}