package test.mypac;
/*
 * 새로운 스레드 만드는 방법
 * 
 * 1. Thread 클래스를 상속 받은 클래스를 정의한다.
 * 2. run() 메소드를 오버라이드 한다.
 * 3. run() 메소드 안에서 새로운 스레드에서 해야 할 작업을 코딩한다.
 * 4. 만든 클래스롤 객체를 생성 후 해당 객체의 start() 메소드를 호출 시 새로운 스레드가 시작한다.
 */
public class AnotherThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("작업을 시작합니다.");
		// 10초가 걸리는 작업
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("작업이 종료했습니다.");
	}
}