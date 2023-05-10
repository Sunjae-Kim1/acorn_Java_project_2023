package test.main;

public class MainClass07 {
	
	// static 메소드에서 사용 시 static 필드로 바꿔야한다.
	public static int num = 999;
	
	// main 메소드는 static 메소드
	public static void main(String[] args) {
		// 클래스명.필드명 형식으로 static 필드를 참조
		int result = MainClass07.num + 1;
		
		// main() 메소드와 num 필드는 둘다 MainClass07 안에 있으므로 
		// ( 같은 공간 ) 클래스명. 은 생략 가능
		int result2 = num + 1;
		
		// 아래의 test() 메소드는 호출?
		// this.tests(); test() 에서 static 이 아니면 Error
		
		MainClass07.test();
		test();
	}
	public static void test() {
		System.out.println("test() 메소드가 호출됐습니다.");
	}
}