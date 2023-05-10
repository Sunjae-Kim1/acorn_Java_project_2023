package test.main;

public class MainClass04 {
	
	public static class Gura{
		public void say() {
			System.out.println("안녕하세요! 구라입니다.");
		}
	}
	
	// static 메소드
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
		
		// 메소드 안에도 클래스를 정의할 수 있다.
		// 메소드 안에 정의한 클래스를 지역 내부 클래스라고 한다. ( = Local Inner Class )
		// 메소드 내부에서만 사용 가능
		class Cat{
			public void say() {
				System.out.println("Meow");
			} // say()
		} // class
		Cat c = new Cat();
		c.say();
	} // main()
} // MainClass04