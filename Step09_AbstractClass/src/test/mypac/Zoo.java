package test.mypac;

public class Zoo {
	public class Monkey{ // Inner Class
		public void say() {
			System.out.println("안녕! 나는 원숭이입니다.");
		}
	}
	
	public class Tiger { // Inner Class
		public void say() {
			System.out.println("안녕! 나는 호랑이입니다.");
		}
	}
	
	public Monkey getMonkey() {
		// 내부 클래스로 객체를 생성해 리턴
		return new Monkey();
	}
	
	public Tiger getTiger() {
		// 내부 클래스로 객체를 생성해 리턴
		return new Tiger();
	}
}