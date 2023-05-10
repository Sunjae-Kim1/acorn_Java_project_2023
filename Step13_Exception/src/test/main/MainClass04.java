package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작했습니다.");
		try {
			/*
			 * 실행의 흐름을 스레드라고 하는데 스레드를 임의로 5초동안 잡아두기
			 * 컴파일 시에 발생하는 Exception ( RuntimeException 을 상속받지 않은 Exception )
			 * 이 발생해서 반드시 try-catch 블럭으로 예외처리한다.
			 */
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료했습니다.");
	}
}