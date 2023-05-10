package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작합니다.");
		
		// 지역 변수는 값을 넣지 않고 선언만 하면 만들어지지 않는다.
		// int num1;
		// String name1;
		
		// 만들어지지 않은 num1 , name1 은 참조 불가
		// int result = 10 + num1;
		// System.out.println(name1);
		
		// 지역 변수를 미리 만들고 후에 필요한 값을 넣고 싶다면 초기값을 대입
		int num1 = 0;
		String name1 = null;
		
		// 필요시 값 대입
		num1 = 10;
		name1 = "김구라";
		
		System.out.println("main 메소드가 종료합니다.");
	}
}